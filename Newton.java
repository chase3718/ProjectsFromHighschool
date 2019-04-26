import java.io.*;
import java.util.*;
public class Newton{
	public static void main (String[]args){
		Scanner r = new Scanner(System.in);
		System.out.print("Input your number ");
		double n = r.nextDouble();
		double g;
		for(double i = n; i > 0; i-= 0.00001){
			g = ((n/i)+i)/2;
			if((g) <= Math.sqrt(n) + 0.00001 && g >= Math.sqrt(n) - 0.00001){
				System.out.println("The sqaure root using Newtons method is more or less " + g);
				System.out.println("The real square root is " + Math.sqrt(n));
				break;
			}
		}
	}
}