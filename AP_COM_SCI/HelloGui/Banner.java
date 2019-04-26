// This applet displays a message moving horizontally
// across the screen.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Banner extends JApplet
  implements ActionListener
{
  private int xPos, yPos;  // hold the coordinates of the banner
  private int msgID = 1;
  public void init()
  {
  	msgID = -msgID;
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    xPos = c.getWidth();
    yPos = c.getHeight() / 2;
    Timer clock = new Timer(200, this);  // fires every 30 milliseconds
    clock.start();
  }

  // Called automatically after a repaint request
  public void paint1(Graphics g)
  {
  	super.paint(g);
  	if(msgID == 1){

    g.drawString("Hello, World!", xPos, yPos);
  	}else{
  	g.drawString("Java is Berst", xPos, yPos);
  	}

  }

  // Called automatically when the timer fires
  public void actionPerformed(ActionEvent e)
  {
    Container c = getContentPane();

    // Adjust the horizontal position of the banner:
    xPos--;
    if (xPos < -100)
    {
      xPos = c.getWidth();
    }

    // Set the vertical position of the banner:
    yPos = c.getHeight() / 2;
	repaint();

  }
}


