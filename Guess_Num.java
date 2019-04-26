import java.util.*;
import java.io.*;
public class Guess_Num {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		System.out.print("Guess a number, 1 - 100. ");
		int guess = input.nextInt();
		int sum = 1;
		while(guess != num){
			if(guess > num){
				System.out.println("Mmmm, to high");
			}else if(guess < num){
				System.out.println("Mmmm, to low");
			}
			System.out.print("Guess a new number, 1 - 100. ");
			guess = input.nextInt();
			sum++;
		}
		if(guess == num){
			System.out.println("YOU ARE RIGHT, THE NUMBER IS " + guess + ". In " + sum + " tries");
		}
	}
}