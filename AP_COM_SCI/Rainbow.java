// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  final Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();
    int xCenter = width/2;
    int yCenter = (height/4)*3;
    int largeRadius = width / 4;
    int smallRadius = height / 4;
    double mR = Math.sqrt(largeRadius*smallRadius);
    int mediumRadius = (int)(mR);
    double sr = largeRadius + 3*smallRadius - 3*mediumRadius;
    int skyRadius = (int)sr;
    g.setColor(Color.RED);
    g.fillArc(xCenter-largeRadius,yCenter-largeRadius,largeRadius*2,largeRadius*2,0,180);
	g.setColor(Color.GREEN);
	g.fillArc(xCenter-mediumRadius,yCenter-mediumRadius,mediumRadius*2,mediumRadius*2,0,180);
	g.setColor(Color.MAGENTA);
	g.fillArc(xCenter-smallRadius,yCenter-smallRadius,smallRadius*2,smallRadius*2,0,180);
    g.setColor(skyColor);
    g.fillArc(xCenter-skyRadius,yCenter-skyRadius,skyRadius*2,skyRadius*2,0,180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
