package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” ) Y
		
		// 2. create a variable of type "Component" that will hold your image
		String image = "http://clipart-library.com/img/773169.png";
		// 3. use the "createImage()" method below to initialize your Component
		Component img = createImage(image); 
		// 4. add the image to the quiz window
		quizWindow.add(img);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog(null,"What color is this animal?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equals("pink")) {
			System.out.println("CORRECT");
			score++;
		} 
		else {
		// 8. print "INCORRECT" if the answer is wrong
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(img);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://t4.ftcdn.net/jpg/01/40/75/15/360_F_140751547_kxWglfUl1rjwW6F4SyEPecrNxaubZZH9.jpg";
		Component img2 = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(img2);
		// 12. pack the quiz window23
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog(null, "How many teeth does this animal have?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("23")) {
			System.out.println("CORRECT");
			score++;
		}
		else {
			System.out.println("INCORRECT");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score + "/2\nThanks For Playing ;)");
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
