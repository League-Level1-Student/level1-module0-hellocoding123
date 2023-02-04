package _99_extra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SensitiveKeyboard implements KeyListener{
	static public void main (String args[]) {
		
		SensitiveKeyboard keyboard = new SensitiveKeyboard();
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
