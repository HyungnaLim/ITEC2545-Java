package topic10.tshirt;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TShirtGUI extends JFrame {
    private JPanel mainPanel;
    private JComboBox<String> sizeComboBox;
    private JComboBox<String> colorComboBox;
    private JLabel selectedSizeLabel;
    private JLabel selectedColorLabel;

    TShirtGUI() {
        setTitle("T-shirt Order Form");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        sizeComboBox.addItem("Small");
        sizeComboBox.addItem("Medium");
        sizeComboBox.addItem("Large");

        // to set the combobox unselected(null) in the beginning - code order matters
        sizeComboBox.setSelectedIndex(-1);

        sizeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sizeSelected = (String) sizeComboBox.getSelectedItem(); // cast object data to String
                selectedSizeLabel.setText("You chose " + sizeSelected);
            }
        });

        // configure combobox model to guarantee that it has one type of data
        String[] colors = {"Red", "Blue", "White", "Black"}; // set an array of data to put in combobox
        DefaultComboBoxModel<String> colorModel = new DefaultComboBoxModel<>(colors); // create a model
        // DefaultComboBoxModel holds the data for a JComboBox & add, remove data, uses generic data type
        colorComboBox.setModel(colorModel); // add data to combobox

        // add and remove elements using model
        colorModel.addElement("Pink");
        colorModel.insertElementAt("Yellow", 3);
        colorModel.removeElementAt(3);

        // adding a list
        // note that the java gui also has List. so if java.awt.* is imported, java util List wouldn't work
        // to fix, remove java.awt.* and import specific class instead on all (*)
        List<String> moreColors = List.of("Purple", "Orange", "Green");
        colorModel.addAll(moreColors);

        // looking for an index of specific item
        int blueIndex = colorModel.getIndexOf("Orange");
        System.out.println(blueIndex);
        int noIndex = colorModel.getIndexOf("Beige");
        System.out.println(noIndex); // if the item is not found in the model, it will return -1

        // add an element if it is not already in the model using index
        if (colorModel.getIndexOf("Gray") == -1) {
            colorModel.addElement("Gray");
        }

        colorComboBox.setSelectedIndex(-1);

//        colorComboBox.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String colorSelected = (String) colorComboBox.getSelectedItem(); // cast data
//                // to avoid cast data, try below!
//                // String colorSelected = colorComboBox.getItemAt(colorComboBox.getSelectedIndex());
//                selectedColorLabel.setText("You chose " + colorSelected);
//            }
//        });

        // lambda function - works the same as action listener code above
        colorComboBox.addActionListener(event -> {
            String colorSelected = (String) colorComboBox.getSelectedItem();
            selectedColorLabel.setText("You chose " + colorSelected);
        });


    }


}
