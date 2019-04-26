import java.io.*;
import java.util.*;
public class Lesson11{
	public static void main (String[]args){
		Scanner a = new Scanner(System.in);
		System.out.print("Input Your Name: ");
		String t = a.nextLine();
			for(int h = t.length(); h > 0; h--){
			System.out.print(t.toLowerCase().substring(h-1,h));
		}
	}
}