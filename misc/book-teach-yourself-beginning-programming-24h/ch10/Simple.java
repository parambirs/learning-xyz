// A simple Java GUI program

import java.awt.*;	// required support files

// Main class
public class Simple extends Frame {

	public Simple() {
		setSize(320, 240);
	}

	@Override
	public void paint(Graphics g) {
		// change subsequent text color to red
		g.setColor(Color.red);

		// write a simple message in the window
		g.drawString("Hello, world!", 75, 100);
	}

	public static void main(String[] args) {
		var simple = new Simple();
		simple.setVisible(true);
	}

}
