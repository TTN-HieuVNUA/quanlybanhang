package init;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Message {

	public static void showMessage(String message) {
		JOptionPane.showMessageDialog(new JFrame(), message, "Dialog", JOptionPane.OK_OPTION);
	}
}
