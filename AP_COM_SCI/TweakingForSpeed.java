import java.io.*;
import java.util.*;
import java.text.*;
public class TweakingForSpeed {
	public static void main (String gg[]) {
		int p = 386, q = 581, n=0;

		System.out.println("Hello");
		double time = System.currentTimeMillis();
		for (int j = 0; j < 2000000000; j++) {
			n = ((p * 2) + q)/2;
		}
		System.out.println(n);
		time = System.currentTimeMillis() - time;
		System.out.println("It took " + time + " milliseconds");
		time = System.currentTimeMillis();
		n = 0;
		for (int j = 0; j < 2000000000; j++) {
			n = p + (q >> 1);
		}
		System.out.println(n);
		time = System.currentTimeMillis() - time;
		System.out.println("It took " + time + " milliseconds");
	}
}