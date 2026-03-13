import javax.swing.*;

public class SwingCalculator {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int intSum;		// holds the sum

		// compute the sum
		intSum = 14 + 35;

		// show user the sum
		JOptionPane.showMessageDialog(null, "The total is " + intSum);

		System.exit(0);	// stops the execution	
	}
}
