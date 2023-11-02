package topic8.movie_giu;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField movieTitleTextField;
    private JSlider ratingSlider;
    private JCheckBox wouldSeeAgainCheckBox;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(500, 400));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers(); // call method
    }

    // create methods

    private void configureEventHandlers() {
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // updating the value label text
                String valueLabelText = ratingSlider.getValue() + "stars";
                sliderValueLabel.setText(valueLabelText);
                // update opinion as change has made on slider
                updateOpinion();
            }
        });

        wouldSeeAgainCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // update opinion as change has made on checkbox
                updateOpinion();
            }
        });

        movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // update opinion as text in the text field has inserted
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // update opinion as text in the text field has removed
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // this is when change is made to the object(font,size,etc), not the text
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // confirm to quit
                int quit = JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure?",
                        "Quit", JOptionPane.OK_CANCEL_OPTION);
                if (quit == JOptionPane.OK_OPTION) {
                    dispose(); // get rid of the itself (Jpanel in this case)
                }
            }
        });
    }


    private void updateOpinion() {
        String movieName = movieTitleTextField.getText().strip(); // use strip method to get rid of empty space in the string

        // when the text field is empty, show the default text
        if (movieName.isEmpty()) {
            movieOpinionLabel.setText("Movie opinion");
            return;
        }

        int rating = ratingSlider.getValue();
        boolean seeAgain = wouldSeeAgainCheckBox.isSelected();
        String opinionTemplate = "You rated %s %d stars. You %s see again.";

//        String seeAgainString = "would";
//        if (!seeAgain) {
//            seeAgainString = "would not";
//        }

        // ternary operator instead of if-else statement (setting values based on a condition)
        String seeAgainString = (seeAgain) ? "would" : "would not";

        String opinion = String.format(opinionTemplate, movieName, rating, seeAgainString);
        movieOpinionLabel.setText(opinion);

    }


}

