package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton autton = new JButton();
	JButton cutton = new JButton();
	JButton dutton = new JButton();
	HashMap<Integer, String> search = new HashMap<Integer, String>();

	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
		ls.createUI();

	}

	void createUI() {
		frame.add(panel);
		panel.add(button);
		panel.add(autton);
		panel.add(cutton);
		panel.add(dutton);
		button.setText("Add Entry");
		autton.setText("Existing People");
		cutton.setText("List of Existing");
		dutton.setText("Delete Entry");
		frame.setSize(200, 200);
		frame.setVisible(true);
		button.addActionListener(this);
		autton.addActionListener(this);
		cutton.addActionListener(this);
		dutton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			String name = JOptionPane.showInputDialog("Would you like to add a name");
			String number = JOptionPane.showInputDialog("Enter a number");
			int num = Integer.parseInt(number);
			search.put(num, name);
		}
		if (autton == e.getSource()) {
			String ID = JOptionPane.showInputDialog("Enter ID Number of Existing Members");
			int you = Integer.parseInt(ID);
			if (search.containsKey(you)) {
				JOptionPane.showConfirmDialog(null, search.get(you));
			} else {
				JOptionPane.showConfirmDialog(null, "Does not Exist");
			}
		}
		if (cutton == e.getSource()) {
			for (Integer i : search.keySet()) {
				JOptionPane.showConfirmDialog(null, "ID: " + i + " Name: " + search.get(i));
			}
		}
		if (dutton == e.getSource()) {
			String Delete = JOptionPane.showInputDialog("Enter ID #");
			int gone = Integer.parseInt(Delete);
			if (search.containsKey(gone)) {
				search.remove(gone);
			} else {
				JOptionPane.showConfirmDialog(null, "Does not Exist");
			}
		}
	}

}

/*
 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
 * an input dialog to ask the user to enter an ID number. After an ID is
 * entered, use another input dialog to ask the user to enter a name. Add this
 * information as a new entry to your HashMap.
 * 
 * Button 2: Search by ID When this button is clicked, use an input dialog to
 * ask the user to enter an ID number. If that ID exists, display that name to
 * the user. Otherwise, tell the user that that entry does not exist.
 * 
 * Button 3: View List When this button is clicked, display the entire list in a
 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
 * 
 * When this is complete, add a fourth button to your window. Button 4: Remove
 * Entry When this button is clicked, prompt the user to enter an ID using an
 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
 * the user that the ID is not in the list.
 *
 */
