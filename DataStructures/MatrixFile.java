import java.io.*;
import java.util.*;

public class MatrixFile {
	public static void main (String[] args) throws IOException{
		Scanner f = new Scanner(new File("MatrixData.txt.txt"));
		int[][] a = new int[3][4];
		int[][] b = new int[4][2];
		int[][] c = new int[a.length][b[0].length];
		int i = -1;
		String something = "";

			something = f.nextLine();
			//System.out.println(something);
			if (something.equals("matrix") && a[a.length-1][a[1].length-1] == 0) {
				something = f.nextLine();
				do {
					if (something.equals("row")) {
						i ++;
						for (int n = 0; n < a[1].length; n++) {
							something = f.nextLine();
							//System.out.println(something);
							a[i][n] = Integer.parseInt(something);
						}
					}
					something = f.nextLine();
				}while (!something.equals("matrix"));
			}
			i = -1;
			if (something.equals("matrix") && b[b.length-1][b[1].length-1] == 0) {
				something = f.nextLine();
				do {
					if (something.equals("row")) {
						i++;
						for (int p = 0; p < b[1].length; p++) {
							something = f.nextLine();
							b[i][p] = Integer.parseInt(something);
						}
					}
					if (f.hasNextLine()){
						something = f.nextLine();
					}
				} while (f.hasNextLine());
			}

		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < b[0].length; y++) {
				for (int z = 0; z < b.length; z++) {
					c[x][y] += a[x][z] * b[z][y];
				}
			}
		}
		for (int m = 0; m < c.length; m++) {
			for (int t = 0; t < c[m].length; t++) {
				System.out.print(c[m][t] + " ");
			}
			System.out.println("");
		}
	}
}
