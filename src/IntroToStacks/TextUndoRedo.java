package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame start = new JFrame();
	JPanel next = new JPanel();
	JLabel after = new JLabel();
	Stack<String> key = new Stack<String>();
	public static void main(String[] args) {

		TextUndoRedo tur = new TextUndoRedo();


	}
	TextUndoRedo(){

		start.setSize(400, 250);	
		start.setVisible(true);
		start.add(next);
		next.add(after);
		start.addKeyListener(this);

	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.

	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//	after.add(e.getKeyChar());

	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		/*	if (next == e.getSource()) {
		after.getText();
		after.setText(after.getText()+ "");
		System.out.println("test" + after);
		}*/
		
	if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {


			key.pop();
			//	key.pop();
			String s ="";
			for (int i = 0; i < key.size(); i++) {
				s+= key.get(i);


				
			}
			after.setText(s);
		}else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			
			}
	else {
			key.push(Character.toString(e.getKeyChar()));
			String st = "";
			for (int i = 0; i < key.size(); i++) {
				st+= key.get(i);



			}
			after.setText(st);
		}



	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
