import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class Tester{
	public static void main (String[] args) throws IOException {
		Scanner data = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\DataStructures\\Heaps\\HeapData2.in"));
		Scanner treein = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\DataStructures\\Heaps\\HeapData2.in"));
		int sum = 0;
		int spaces = 0;
		String a = "";
		while(data.hasNextLine()) {
			sum ++;
			a = data.nextLine();
		}
		String tree[] = new String[sum];
		for (int x = 0; x < tree.length; x++) {
			tree[x] = treein.nextLine();
		}
		int levels = 1;
		int ex = 1;
		for (int z = 0; z < tree.length; z ++) {
			if (z == (Math.pow(2,ex) - 1)) {
				levels ++;
				ex ++;
			}
		}
		ex = 1;
		int col = 0;
		for (int y = 0; y < tree.length; y ++) {

			if (y == (Math.pow(2,ex) - 1)) {
				ex ++;
				System.out.println();
				col = 0;
			}
			spaces = (int)Math.pow(2,levels - (ex-col)) - 1;
			for (int i = 0; i < spaces; i ++) {
				System.out.print(" ");
			}
			System.out.print(tree[y]);
			col = 1;
		}

	}
}