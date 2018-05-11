import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sesitivKeboard implements KeyListener {
	
	JFrame window = new JFrame();
	JPanel panal = new JPanel();
	JLabel lable = new JLabel();
	//JLabel 
public static void main(String[] args)  {
	
	new sesitivKeboard().getSwing();
	
}
void getSwing() {
	window.add(panal);
	window.setVisible(true);
	window.addKeyListener(this);
	
//
	
    panal.add(lable);
    lable.setText("kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps kaburpslaps ");
}


static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	speak("ouch");
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
} 
