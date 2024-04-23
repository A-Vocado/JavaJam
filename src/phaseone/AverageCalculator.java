package phaseone;
import javax.swing.*;

// Create a program that receives a student's two bimonthly grades, calculates and displays the final arithmetic average.

public class AverageCalculator {
    public static void main(String[] args) {
        // input
        String iFirstGrade = JOptionPane.showInputDialog("Type the first grade");
        String iSecondGrade = JOptionPane.showInputDialog("Type the second grade");

        // convert String values
        double firstGrade = Double.parseDouble(iFirstGrade);
        double secondGrade = Integer.parseInt(iSecondGrade);

        // process
        double ArithAverage = (firstGrade + secondGrade) / 2;

        // output
        JOptionPane.showMessageDialog(null,"Student's bimonthly grades average: " + ArithAverage);

    }
}
