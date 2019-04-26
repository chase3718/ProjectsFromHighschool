//Bank.java
//Mr.Awesome
//Star date 5/9/14

import java.util.*;
import java.io.*;

public class Bank{
	private double balance;
	private String name;
	public Bank(double b,String nm){
		balance = b;
		name = nm;
	}
	public void doDeposit(double d){
		balance = balance + d;
	}
	public void doWithdraw(double w){
		balance = balance - w;
	}
	public double getBalance(){
		return balance;
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("How much money do you have in your acount and what is your name? ");
		double bal = input.nextDouble();
		String nom = input2.nextLine();
		Bank b1 = new Bank(bal,nom);
		System.out.print("How much do you want to deposit? ");
		double dep = input.nextDouble();
		b1.doDeposit(dep);
		System.out.print("How much do you want to withdraw? ");
		double wit = input.nextDouble();
		b1.doWithdraw(wit);

		System.out.println("The accccccount of " + b1.name + " has $" + b1.balance + " left.");
	}
}