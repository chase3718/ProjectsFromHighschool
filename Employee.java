import java.util.*;
import java.io.*;
public class Employee{
	private String nam;
	private double payr;
	private String ssn;
	private int hours;
	private double tax;
	public Employee(String n, double p, String s){
		nam = n;
		payr = p;
		ssn  = s;
	}
	public String getName(){
		return nam;
	}
	public void setName(String n){
		nam = n;
	}
	public double getPay(){
		return payr;
	}
	public void setPay(double p){
		payr = p;
	}
	public String getSecuritynum(){
		return ssn;
	}
	public void setSecuritynum(String s){
		ssn = s;
	}
	/*public double payCheck(int h, double t){
		double enpay = (h*payr)/(1-t);
	}*/
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input Name: ");
		String innam = input.nextLine();
		System.out.print("Input Social Security Number: ");
		String insec = input.nextLine();
		System.out.print("Input Pay Rate: ");
		double inpay = input.nextDouble();
		Employee e1 = new Employee(innam,inpay,insec);
		System.out.print("How many hours worked: ");
		int inhour = input.nextInt();
		System.out.print("What is the tax rate: ");
		double intax = input.nextDouble();
		//payCheck pc1 = new payCheck(inhour,intax);
		double enpay = (inhour*e1.payr)*(1-intax);
		enpay = (int)(enpay * 100);
		enpay = (double)(enpay);
		enpay = enpay / 100;
		System.out.print("Name: " + e1.nam + ". Makes $" + (enpay) + ".");
	}
}