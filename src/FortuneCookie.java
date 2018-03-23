import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FortuneCookie implements ActionListener {
	
public static void main(String[] args) {
	new FortuneCookie().showButton();
	int rando = new Random().nextInt(5);
	
}

void showButton() {

System.out.println("button");
JFrame window = new JFrame ();
window.setVisible(true);

JButton botton1 = new JButton();
window.add(botton1);

botton1.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "woohoo");
}
}
