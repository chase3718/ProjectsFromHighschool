import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;

public class Simulator extends JFrame {
	JTextField inputNumber, displayNewNumber;
	public Simulator() {
		super("Simulator");
		JLabel newNumber = new JLabel("Input Number: ", SwingConstants.RIGHT);
		inputNumber = new JTextField(5);
		JLabel displayNumber = new JLabel("New Number: ", SwingConstants.RIGHT);
		displayNewNumber = new JTextField(5);
		displayNewNumber.setEditable(false);
		JButton go = new JButton("Compute");
    	go.addActionListener(this);
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5));
		p.add(inputNumber);
		c.add(p, BorderLayout.CENTER);
		c.add(go, BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e) {
		int number = Integer.parseInt(inputNumber.getText());
		DecimalFormat df = new DecimalFormat("00.0");
    	displayYearsHuman.setText(df.format(humanYears));
	}
	public static void main(String[] args) {
		Simulator w = new Simulator();
		w.setBounds(300, 300, 300, 160);
    	w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	w.setVisible(true);
	}
}