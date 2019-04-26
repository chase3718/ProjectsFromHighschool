import java.util.*;
import java.io.*;

public class Telemetry {
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\Switches.in"));
		int n = -1;
		int a[] = new int[4];
		while(sc.hasNext()){
			n ++;
			a[n] = sc.nextInt();
		}
		String[] jj = new String[a.length];
		for (int y = 0; y < a.length; y++) {
			jj[y] = Integer.toBinaryString(a[y]);
			for (int x = jj[y].length(); x <= 8; x++) {
				jj[y] = "0" + jj[y];
			}
			System.out.println(jj[y]);
		}
		for (int k = 0; k < jj.length; k++) {
			String q = jj[k];
			System.out.println(a[k]);
			for (int l = q.length()-1; l > 0; l--) {
				if (q.substring(l,l+1).equals("1")){
					System.out.println("Switch sw" + (l + 56) + " is on");
				}
				else {
					System.out.println("Switch sw" + (l + 56) + " is off");
				}
			}
		}
		/*for (int k = 0; k < a.length; k++) {
			int r = a[k];
			String bin = "";
				while(r > 0) {
					int rem = r % 2;
					bin = rem + bin;
					r /= 2;
				}

			System.out.println(a[k]);
			for (int o = 0; o < bin.length()-1; o++) {
				int yomama = (int)((int)a[k] & (int)Math.pow(2,o));
				System.out.println(yomama);
			}
		}*/
	}
}