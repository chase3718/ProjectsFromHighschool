import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Bmi extends JFrame
  implements ActionListener
{
  JTextField inputDogYears, displayYearsHuman;

  public Bmi()
  {
    super("Dog Years Calc");
    JLabel labelDogYears = new JLabel("Years (Dog):", SwingConstants.RIGHT);
    inputDogYears = new JTextField(5);
    JLabel labelYearsHuman = new JLabel("Years (Human):", SwingConstants.RIGHT);
    displayYearsHuman = new JTextField(5);
    displayYearsHuman.setEditable(false);
    JButton go = new JButton("Compute");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.white);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelDogYears);
    p.add(inputDogYears);
    p.add(labelYearsHuman);
    p.add(displayYearsHuman);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    int DogYears = Integer.parseInt(inputDogYears.getText());
    double humanYears = calculateYearsHuman(DogYears);
    DecimalFormat df = new DecimalFormat("00.0");
    displayYearsHuman.setText(df.format(humanYears));
  }

  // Returns BMI equal to weight in kilograms divided
  // over squared height in meters.
  private double calculateYearsHuman(int DogYears)
  {
    double humanYears = (int)((((DogYears - 1.0) * (16.0/3.0)) + 13.0)+0.5);
    return humanYears;
  }

  public static void main(String[] args)
  {
    Bmi w = new Bmi();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}
