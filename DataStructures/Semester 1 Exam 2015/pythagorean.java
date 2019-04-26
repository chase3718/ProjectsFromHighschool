import java.util.*;
import java.io.*;
public class pythagorean {
	public static void main(String[] args) {
		for (int c = 5; c < 1000; c++) {
			for (int b = 2; b < c; b ++) {
				for (int a = 1; a < b; a++) {
					if ((c*c) - ((a*a) + (b*b)) == 0 && a + b + c == 1000) {
						System.out.println(a + " " + b + " " + c);
						System.out.print(a*b*c);
					}
				}
			}
		}
	}
}