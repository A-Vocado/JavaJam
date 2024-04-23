package phaseone;
import javax.swing.*;

// Create a program that receives a value from a sale and a number of installments that the customer wants to pay.
// Calculate and show the value of the installment.

public class InstallmentCalculator {
    public static void main(String[] args) {
        // input
        String iValue = JOptionPane.showInputDialog("Item Price");
        String iInstallment = JOptionPane.showInputDialog("Installment Amount");

        // convert String values
        double value = Double.parseDouble(iValue);
        int installment = Integer.parseInt(iInstallment);

        // process
        double installmentPrice = value / installment;

        // output
        JOptionPane.showMessageDialog(null,installment + " amounts of $" + installmentPrice);

    }
}
