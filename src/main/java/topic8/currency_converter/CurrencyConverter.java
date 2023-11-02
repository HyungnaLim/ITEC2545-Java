package topic8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox; // set a type of object to contain

    private final String EUROS = "Euros";
    private final String POUNDS = "Pounds";
    private final String WONS = "Wons";
    private Map<String, Double> exchangeRates = Map.of(EUROS,0.94, POUNDS,0.82, WONS,1341.93);

    // constructor
    CurrencyConverter() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,300)); // set the window size, do this before pack!
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // make button work with enter as well as click
        getRootPane().setDefaultButton(convertButton);

        // add strings to the combobox
        currencyComboBox.addItem(EUROS);
        currencyComboBox.addItem(POUNDS);
        currencyComboBox.addItem(WONS);

        // give action to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String dollarString = dollarsTextField.getText(); // get the string typed in
                    double dollar = Double.parseDouble(dollarString); // convert string to double - exceptions handling needed
                    String toCurrency = (String) currencyComboBox.getSelectedItem(); // get object from the combobox & cast it to string
                    double exchangeRate = exchangeRates.get(toCurrency); // get exchange rate from the hashmap
                    double convertedValue = dollar * exchangeRate; // convert the currency
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s", dollar, convertedValue, toCurrency); // set a result format
                    conversionResultLabel.setText(resultString); // display result in label
                } catch (NumberFormatException nfe) {
                    // show dialog box with JOptionPane
                    // parentComponent needed in the argument to block user to control it while having the error message
                    JOptionPane.showMessageDialog(CurrencyConverter.this, "Please enter a number without any letters or symbols");
                }
            }
        });
    }


}