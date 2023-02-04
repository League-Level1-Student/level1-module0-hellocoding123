package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Barking");
	JButton button2 = new JButton("Bell");
	JButton button3 = new JButton("Spaceship");
	JButton button4 = new JButton("Sawing wood");

	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
	    panel.add(button);
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(button4);
	    frame.add(panel);
	    button.addActionListener(this);
	    button.setSize(100, 50);
	    frame.pack();
	}
	
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == button) {
			playSound("labrador-barking-daniel_simon.wav");
		}
		else if(buttonPressed == button2) {
			playSound("service-bell_daniel_simion.wav");
		}
		else if(buttonPressed == button3) {
			playSound("alien-spaceship_daniel_simion.wav");
		}
		else if(buttonPressed == button4) {
			playSound("sawing-wood-daniel_simon.wav");
		}
			
	}
	
}
