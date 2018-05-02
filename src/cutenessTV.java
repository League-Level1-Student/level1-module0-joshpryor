import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JFrame window = new JFrame();
	JPanel panal = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {

		new cutenessTV().getGoing();

	}

	private void getGoing() {
		window.add(panal);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		panal.add(button1);
		panal.add(button2);
		panal.add(button3);

		// panal.add(button5);
		button1.setText("duck");
		button1.addActionListener((ActionListener) this);
		button2.setText("frog");
		button2.addActionListener((ActionListener) this);
		button3.setText("unicorn");
		button3.addActionListener((ActionListener) this);
		window.pack();
	}

	public void actionPerformed(ActionEvent arg0) {

		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed == button1) {
			showDucks();
		}
		if (buttonPressed == button2) {
			showFrog();
		}
		if (buttonPressed == button3) {
			showFluffyUnicorns();
		}

	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
