package phaseone;

// Create a program that receives a dollar value and the price of the day.
// Convert and display the value in Brazilian Reais (BRL).

import javax.swing.*;

public class DollarExchangeRate {
    public static void main(String[] args) {
        // input
        String iDollarValue = JOptionPane.showInputDialog("What's the dollar's price today?");
        String iDollarAmount = JOptionPane.showInputDialog("How many dollars do you want?");

        // convert String values
        double dollarValue = Double.parseDouble(iDollarValue);
        double dollarAmount = Double.parseDouble(iDollarAmount);

        // process
        double finalPrice = dollarAmount * dollarValue;


        // output
        JOptionPane.showMessageDialog(null,"You'll pay: R$ " + finalPrice);
    }
}
