
import java.io.*;
import java.util.*;

public class Lesson7{
	public static void main(String[]args){
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter the area here: ");
		double area = kbReader.nextDouble();
		double r = Math.sqrt(area / Math.PI);
		System.out.println("Your radius is: " + r);
		Name();
	}
public static void Name(){
	Scanner kbReader = new Scanner(System.in);
	System.out.print("What, is your first name? ");
	String n = kbReader.next();
	System.out.print("What, is your last name? ");
	String l = kbReader.next();
	System.out.print("What, is your favorite color? " );
	String c = kbReader.next();
	System.out.print("Your full name is " + n + " " + l + ", your favorite color is " + c + ".");
}
}