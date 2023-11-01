package topic8.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    // Constructor for HelloGUI object
    HelloGUI() {
        setContentPane(mainPanel); // specify the container(Jpanel) of all the contents
        setPreferredSize(new Dimension(300, 500)); // set the window size (pixel)
        pack(); // put all the contents in the panel in the right way
        setVisible(true); // set all the Jframe visible
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // make sure when you close Jframe it stops the program running

        // giving button some action
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // class definition for the ActionListener
                // code here will run when the button is clicked
                myFirstLabel.setText("Hello GUI Programmers!!"); // change the text on the label
            }
        });

    }


}
