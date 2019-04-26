import java.io.*;
import java.util.*;

public class Countemright {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		while (!s.equals("EXIT")) {
			s = sc.nextLine();
			s = s.toUpperCase();
			s = s + "O";
			s = s.replaceAll("\\s","");
			String sp[] = s.split("SA");
			if (!s.equals("EXIT")) {
			System.out.println("There are " + ((sp.length) - 1) + " occurences");
			}
		}
	}
}