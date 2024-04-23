package phaseone;

//Create a program that receives the number of nights and the amount consumed in the minibar by a guest.
// Knowing that the daily rate is R$85.00, calculate and show the total to be paid

import javax.swing.*;

public class HotelInvoice {
    public static void main(String[] args) {
        // input
        String iDaysQty = JOptionPane.showInputDialog("Quantity of days");
        String iMiniBar = JOptionPane.showInputDialog("Consumed Minibar? true / false");

        // convert String
        double daysQty = Double.parseDouble(iDaysQty);
        boolean miniBar = Boolean.parseBoolean(iMiniBar);

        // process
        double dailyPrice = 125;
        double itemPrice = 2;
        double miniBarPrice = 0;

        if (miniBar == true){
            String iHowMany = JOptionPane.showInputDialog("How many items?");
            double howMany = Double.parseDouble(iHowMany);
            miniBarPrice = itemPrice * howMany;
        }

        double totalAmount = daysQty * dailyPrice + miniBarPrice;

        // output
        JOptionPane.showMessageDialog(null,"Total Amount: $" + totalAmount);
    }
}
