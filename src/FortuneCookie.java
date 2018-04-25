import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JButton botton1 = new JButton();
	JButton botton2 = new JButton();
	JButton botton3 = new JButton();
	JButton botton4 = new JButton();

	public static void main(String[] args) {
		// new FortuneCookie().showButton();
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	//
	void showButton() {

		System.out.println("button");
		JFrame window = new JFrame();
		JPanel panal = new JPanel();
		window.setVisible(true);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botton1.setSize(100, 200);
		botton1.setText("Bird McFlapington (Get Foutune)");
		window.add(panal);
		panal.add(botton1);
		botton1.addActionListener(this);
		window.pack();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		int rando = new Random().nextInt(5);
		if (buttonPressed == botton1) {
			String bob = JOptionPane.showInputDialog(null, "enter name");
			if (bob.equalsIgnoreCase("josh")) {
				JOptionPane.showMessageDialog(null, "you are the most awesome person on earth");
			}
			//
			if (rando == 0) {
				JOptionPane.showMessageDialog(null, bob + " will go somewhere you have always wanted to go");
			}
			if (rando == 1) {
				JOptionPane.showMessageDialog(null, bob + " will live a long life");
			}
			if (rando == 2) {
				JOptionPane.showMessageDialog(null, bob + " will gain lots of money very soon");
			}
			if (rando == 3) {
				JOptionPane.showMessageDialog(null, bob + " will die");
			}
			if (rando == 4) {
				JOptionPane.showMessageDialog(null, bob + " will live");
			}
		}

	}
}
