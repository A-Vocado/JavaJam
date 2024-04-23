package phaseone;

// Create a program that receives the market price of a vehicle, calculates and displays the Tax value.
// Tax represents 3% of the vehicle's market price.

import javax.swing.*;

public class CalculateCarTax {
    public static void main(String[] args) {
        // input
        String iCarValue = JOptionPane.showInputDialog("What's the vehicle's market price?");

        // convert String
        double carValue = Double.parseDouble(iCarValue);

        // process
        double taxValue = (0.03) * carValue;

        // output
        JOptionPane.showMessageDialog(null, "You have to pay $" + taxValue + " in taxes.");
    }
}
