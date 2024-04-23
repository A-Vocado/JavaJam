package phaseone;

// Create a program that calculates and displays the total payable by customers at a bakery counter.
// The program should request that the quantities of bread and liters of milk desired be informed.
// Each loaf costs $0.25 and a liter of milk costs $1.40.

import javax.swing.*;

public class BakeryInvoice {
    public static void main(String[] args) {
        // input
        String iMilkQty = JOptionPane.showInputDialog("Type the amount of milk");
        String iBreadQty = JOptionPane.showInputDialog("Type the amount of bread");

        // convert String
        double milkQty = Double.parseDouble(iMilkQty);
        double breadQty = Double.parseDouble(iBreadQty);

        // process
        double milkPrice = 4.5;
        double breadPrice = 0.5;
        double finalValue = (milkQty*milkPrice) + (breadQty*breadPrice);

        //output
        JOptionPane.showMessageDialog(null,"Milk: " + milkQty + "\nBread: " + breadQty +
                "\nTotal Amount: $" + finalValue);
    }
}
