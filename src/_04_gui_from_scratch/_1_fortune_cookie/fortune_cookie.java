package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
	    frame.add(button);
	    button.addActionListener(this);
	    button.setText("Click me to get your fortune");
	    button.setSize(100, 50);
	    frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Try again");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You have good luck for the next 24 hours!");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "<insert fortune here>");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Something bad will happen to you very soon, watch out!");
		}
		if (rand == 5) {
			JOptionPane.showMessageDialog(null, "idk tbh");
		}
	}     
	
}
