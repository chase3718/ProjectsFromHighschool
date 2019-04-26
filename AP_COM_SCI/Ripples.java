import java.util.*;
import java.io.*;

public class Ripples {
    public static void main (String[] args) {
		Scanner r = new Scanner (System.in);
		Scanner c = new Scanner (System.in);
		boolean finished = false;
		boolean enteringQ = true;
		boolean nextCustomer = true;
		while (!finished) {
			while (enteringQ) {
				System.out.print("Enter quantity: ");
				int ripple = r.nextInt();
				if (ripple % 25 == 0) {
					System.out.println("You have ordered " + ripple + " Ripples -- $" + ripple * .26);
					enteringQ = false;
				} else {
					System.out.println("Ripples can only be ordered in packs of 25.");
				}
			}
			while (nextCustomer) {
				System.out.print("Next Customer (y/n): ");
				String nextCust = c.nextLine();
				if (nextCust.equals("n")) {
					finished = true;
					nextCustomer = false;
				} else if (nextCust.equals("y")) {
					finished = false;
					nextCustomer = false;
				} else {
					nextCustomer = true;
				}
			}
			nextCustomer = true;
			enteringQ = true;
		}
    }

}