
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java
	// package,
	// or if you prefer, get celebrity photos from the Internet, place them in the
	// default
	// package, and change the names below.

	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method below

		for (int i = 0; i <= 4; i++) {

			// 4. Ask the user who this person is and store their answer
			String guess = JOptionPane.showInputDialog("who is this?");

			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
			if (i == 0) {
				if (guess.equalsIgnoreCase("arnold")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("Schwarzenegger")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("arnold Schwarzenegger")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("josh is awesome")) {
					JOptionPane.showMessageDialog(null, "josh IS awesome,  you get 50 points");
					score += 50;
				} 
				else if (guess.equalsIgnoreCase("finn is awesome")) {
					JOptionPane.showMessageDialog(null, "no, finn sucks,  subtract 50 points");
					score -= 50;
				}
				else if (guess.equalsIgnoreCase("marc is awesome")) {
					JOptionPane.showMessageDialog(null, "i dontknow what to say to that so, score stays the same");
					score += 0;
				}else {
					JOptionPane.showMessageDialog(null, "no,          INCORRECT");
				}
			}
			// dicaprio
			if (i == 1) {
				if (guess.equalsIgnoreCase("leonardo")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("leo")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("dicaprio")) {
					JOptionPane.showMessageDialog(null, "yes");

					score += 1;
				} else if (guess.equalsIgnoreCase("leonardo dicaprio")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("josh is awesome")) {
					JOptionPane.showMessageDialog(null, "josh IS awesome,  you get 50 points");
					score += 50;
				}
				else if (guess.equalsIgnoreCase("finn is awesome")) {
					JOptionPane.showMessageDialog(null, "no, finn sucks,  subtract 50 points");
					score -= 50;
				}
				else if (guess.equalsIgnoreCase("marc is awesome")) {
					JOptionPane.showMessageDialog(null, "i dontknow what to say to that so, score stays the same");
					score += 0;
				}else {
					JOptionPane.showMessageDialog(null, "no,       INCORRECT");
				}
			}

			// morgan freeman
			if (i == 2) {
				if (guess.equalsIgnoreCase("morgan")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("freeman")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("morgan freeman")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("josh is awesome")) {
					JOptionPane.showMessageDialog(null, "josh IS awesome,  you get 50 points");
					score += 50;
				} 
				else if (guess.equalsIgnoreCase("finn is awesome")) {
					JOptionPane.showMessageDialog(null, "no, finn sucks,  subtract 50 points");
					score -= 50;
				}
				else if (guess.equalsIgnoreCase("marc is awesome")) {
					JOptionPane.showMessageDialog(null, "i dontknow what to say to that so, score stays the same");
					score += 0;
				}else {
					JOptionPane.showMessageDialog(null, "no,      INCORRECT");
				}
			}

			// jack blackcondition
			if (i == 3) {
				if (guess.equalsIgnoreCase("jack")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				} else if (guess.equalsIgnoreCase("black")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				}
				else if (guess.equalsIgnoreCase("jack black")) {
					JOptionPane.showMessageDialog(null, "yes");
					score += 1;
				}
				else if (guess.equalsIgnoreCase("finn is awesome")) {
					JOptionPane.showMessageDialog(null, "no, finn sucks,  subtract 50 points");
					score -= 50;
				}
				else if (guess.equalsIgnoreCase("marc is awesome")) {
					JOptionPane.showMessageDialog(null, "i dontknow what to say to that so, score stays the same");
					score += 0;
				}
				else if (guess.equalsIgnoreCase("josh is awesome")) {
					JOptionPane.showMessageDialog(null, "josh IS awesome,  you get 50 points");
					score += 50;
				} else {
					JOptionPane.showMessageDialog(null, "no,      INCORRECT");
				}

			}
			if (i == 4) {
				i = 1;
			}
			// 6. Otherwise:
			// -- Tell them they are wrong and who the person is

			// 7. Use the showNextImage() method below to get the next image
			
			// 8. Show them their current score
			System.out.println(score);
			// 9. .... repeat for all your images.....
System.out.println("i= "+ i);
showNextImage();
		}
	
		
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the image.
		window.setSize(150, 110);

		showNextImage();

	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.out.println("the end");
		System.exit(0);
		return new JLabel();
	}
}
