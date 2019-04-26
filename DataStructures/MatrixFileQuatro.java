import java.io.*;
import java.util.*;

public class MatrixFileQuatro {
	public static void main (String[] args) throws IOException {
		Scanner ms = new Scanner(new File("MatrixDataAnyDimension.txt.txt"));
		Scanner f = new Scanner(new File("MatrixDataAnyDimension.txt.txt"));
		int[][] an = new int[100][1];
		int[][] ay = new int[100][1];
		String IDK = "";
		int mat = 0;
		do {
			IDK = ms.nextLine();
			if (IDK.equals("matrix")){
				mat ++;
				System.out.println("neil suks" + mat);
			}
			IDK = ms.nextLine();
			//do {

					if (IDK.equals("row")) {
						an[mat][0] ++;
						System.out.println("neil us gey" + an);
					}
					IDK = ms.nextLine();
					do {
						ay[mat][0] ++;
						System.out.println("neil 1s a butt" + ay);
						IDK = ms.nextLine();
					} while  (!IDK.equals("row") && !IDK.equals("matrix"));
					if (IDK.equals("matrix")) {
						mat ++;
						System.out.println("neil suks" + mat);
					}

				IDK = ms.nextLine();
		} while (ms.hasNextLine());
		by ++;
		System.out.println("neil is a nice guy" + by);
		int[][] a = new int[an][ay / an];
		int[][] b = new int[bn][by / bn];
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