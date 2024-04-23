package phaseone;

// Make a program that receives the distance of a trip (in km) and the number of liters of fuel consumed.
// Calculate and display vehicle consumption (in km/l)

import javax.swing.*;

public class FuelEfficiency {
    public static void main(String[] args) {
        // input
        String iDistance = JOptionPane.showInputDialog("Type the trip's distance");
        String iFuelQty = JOptionPane.showInputDialog("Type the fuel consume");

        // convert String
        double distance = Double.parseDouble(iDistance);
        double fuelQty = Double.parseDouble(iFuelQty);

        // process
        double fuelAutonomy = distance / fuelQty;

        // output
        JOptionPane.showMessageDialog(null, fuelAutonomy + "Km/l");
    }
}
