import java.io.*;
import java.util.*;

public class Halflife{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("What is the name of the material? ");
		String n = input.nextLine();
		System.out.print("What is its symbol? ");
		String s = input.nextLine();
		System.out.print("What is its half-life? ");
		double h = input.nextDouble();
		System.out.print("What percent is left? ");
		int left = input.nextInt();
		double x = 100;
		double t = 0;
		while(x>left){
			x/=2;
			t += h;
			System.out.println("At " + x + "%, time taken = " + (t));

		}

	}
}