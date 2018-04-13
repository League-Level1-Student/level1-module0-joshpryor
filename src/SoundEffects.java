import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.JApplet;
import javax.swing.JButton;

import java.io.IOException;
public  class SoundEffects implements ActionListener {
	JFrame window = new JFrame();
	JPanel panal = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {

		
		new SoundEffects().getGoing();
		
	}

	private void getGoing() {
		window.add(panal);
		panal.add(button1);
		panal.add(button2);
		button1.setText("sawing wood");
		button1.addActionListener((ActionListener) this);
		button2.setText("gunshot");
		button2.addActionListener((ActionListener) this);
		window.pack();
		
	}
	
	
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		SoundEffects sawingWood = new SoundEffects();
		if (buttonPressed == button1) {
			sawingWood.playSound("sawing-wood-daniel_simon.wav");
		}
		SoundEffects gunshot = new SoundEffects();
		if (buttonPressed == button2) {
			
		}
		gunshot.playSound("gunshot1.wav");	
	}

}
