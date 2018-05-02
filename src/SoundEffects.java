import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JFrame window = new JFrame();
	JPanel panal = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	// JButton button5 = new JButton();

	public static void main(String[] args) {

		new SoundEffects().getGoing();

	}

	private void getGoing() {
		window.add(panal);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		panal.add(button1);
		panal.add(button2);
		panal.add(button3);
		panal.add(button4);
		// panal.add(button5);
		button1.setText("sawing wood");
		button1.addActionListener((ActionListener) this);
		button2.setText("cymbal");
		button2.addActionListener((ActionListener) this);
		button3.setText("bass");
		button3.addActionListener((ActionListener) this);
		button4.setText("drum");
		button4.addActionListener((ActionListener) this);
		// button5.setText("quiet wispers");
		// button5.addActionListener((ActionListener) this);
		window.pack();
		//
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		// SoundEffects sawingWood = new SoundEffects();
		if (buttonPressed == button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		// SoundEffects gunshot = new SoundEffects();
		else if (buttonPressed == button2) {
			playSound("cymbal.wav");
		}
		// SoundEffects gunshot = new SoundEffects();
		else if (buttonPressed == button3) {
			playSound("bass.wav");
		}
		// SoundEffects gunshot = new SoundEffects();
		else if (buttonPressed == button4) {
			playSound("drum.wav");
		}
		// else if (buttonPressed == button5) {
		// playSound("gunshot1.wav");
		// }

	}

}
