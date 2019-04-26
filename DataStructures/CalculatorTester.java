import java.io.*;
import java.util.*;
public class CalculatorTester {
	public static void main (String[] args) {
		StackLL calc = new StackLL();
		Scanner in = new Scanner(System.in);
		boolean end = false;
		do {
			System.out.print("Type a number, an operator (+,-,*,/), or END then hit ENTER. ");
			String ln = in.nextLine();
			if (ln.equals("+")) {
				calc.add();
			} else if (ln.equals("-")) {
				calc.subtract();
			} else if (ln.equals("*")) {
				calc.multiply();
			} else if (ln.equals("/")) {
				calc.divide();
			} else if (ln.equals("END")) {
				end = true;
			} else {
				calc.push(Integer.parseInt(ln));
			}
		} while (!end);
		System.out.println(calc.pop());
	}
}