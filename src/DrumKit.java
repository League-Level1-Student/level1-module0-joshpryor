/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;
    JLabel thingThingThing;
    JLabel thingThingThingThingThing;

    public static void main(String[] args) throws Exception {
   	 new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
   	 // 1. Make a JFrame variable and initialize it using "new JFrame()"
   JFrame	frame = new JFrame();
  	 // 2. Make the frame visible
   	 frame.setVisible(true);
   	 // 3. Set the size of the frame
   	 frame.setSize(500, 500);
   	 // 4. Set the title of the frame
   	 frame.setTitle("the adventures of bob the foot");
   	 // 5. Make a JPanel and initialize it.
   	 JPanel panel = new JPanel();
   	 // 6. Add the panel to the frame. (The panel is invisible.)
    frame.add(panel);
   	 // 7. Download an image of a drum from the Internet. Drop it into your Eclipse project under "default package".

    // 8. Put the name of your image in a String variable.
    String simbaTheSign = "snare.jpg";
   	 // 9. Edit the next line to use your String variable
drumLabelWithImage = createLabelImage(simbaTheSign);
   	 JLabel label = new JLabel();
   	 label.setText("Bird FlapFlap Mcflapington");
   	 // 10. Add the image to the panel
panel.add(drumLabelWithImage);
panel.add(label, null);
   	 // 11. Set the layout of the panel to "new GridLayout()"
panel.setLayout(new GridLayout());
   	 // 12. call the pack() method on the frame
String sting = "cymbal.jpg";
thingThingThing = createLabelImage(sting);

String sammyTheString = "yeet(copy).jpg";
thingThingThingThingThing = createLabelImage(sammyTheString);

   	 // 13. add a mouse listener to drumLabelWithImage.
panel.add(thingThingThing);
panel.add(thingThingThingThingThing);
drumLabelWithImage.addMouseListener(this);
thingThingThing.addMouseListener(this);
thingThingThingThingThing.addMouseListener(this);
frame.pack();}

    public void mouseClicked(MouseEvent e) {
   	 // 14. When the mouse is clicked, print "mouse clicked"

   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 15. Download a drum sound and drop it into your "default package". You can find it on freesound.org. To download it, log in as leagueofamazing/code4life.
   	 // 16. If they clicked on the drumImage...
if (drumClicked.equals(drumLabelWithImage)) {
	playSound("drum.wav");
}
if (drumClicked.equals(thingThingThing)) {
	playSound("cymbal.wav");
}
if (drumClicked.equals(thingThingThingThingThing)) {
	playSound("bass.wav");
}
   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}


    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}



