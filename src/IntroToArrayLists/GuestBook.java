package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other
		// button reads "View Names".
		GuestBook gb = new GuestBook();
		ArrayList<String> people = new ArrayList<String>();
		people.add(name);
	}
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList.

	// When the "View Names" button is clicked, display a message dialog that
	// displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton autton = new JButton();

	GuestBook() {
		frame.add(panel);
		panel.add(button);
		panel.add(autton);
		button.setText("Add Name");
		autton.setText("View Names");
		frame.setSize(200, 200);
		frame.setVisible(true);
		button.addActionListener(this);
		autton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String name = JOptionPane.showInputDialog("Would you like to add a name");
		}
		if (autton == e.getSource()) {
			ArrayList<String> people = new ArrayList<String>();
			String name = null;
			people.add(name);
		}
	}
}