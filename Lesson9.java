import java.io.*;
import java.util.*;
public class Lesson9{
	public static void main(String[]args){
		System.out.print("Input an integer: ");
		Scanner t = new Scanner(System.in);
		int l = t.nextInt();
		if(l % 2 == 0){
			System.out.println(l + " is even");
		}else{
			System.out.println(l + " is odd");
		}
	}
}