import java.util.*;
import java.io.*;

public class Determinant {
	public static int[][] readMatrix () throws IOException {
		Scanner sc = new Scanner(new File("Det4X4Data.txt"));
		int[][] a = new int[10][10];
		int row = -1;
		int mra = 0;
		int column = -1;
		int mca = 0;
		String nextL;
		sc.nextLine();
		row = -1;
		column = -1;
		do {
			nextL = sc.nextLine();
			if (nextL.equals("row")) {
				row++;
				mra = Math.max(mra,row+1);
				column = -1;
			}
			else if (!nextL.equals("matrix")) {
				column++;
				mca = Math.max(mca,column+1);
				a[row][column] = Integer.parseInt(nextL);
			}
		} while (sc.hasNextLine());
		int[][] a2 = new int[mra][mca];
		for (int y = 0; y < mra; y++) {
			for (int x = 0; x < mca; x++) {
				a2[y][x] = a[y][x];
			}
		}
		/*for (int qrt = 0; qrt < a2.length; qrt++) {
			for (int trq = 0; trq < a2[qrt].length; trq ++) {
				System.out.print(a2[qrt][trq] + " ");
			}
			System.out.println();
		}*/
		return a2;
	}
	public static int computeDeterminantIterative (int [][] mat) {
		if (mat.length == 2) {
			return (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		}
		if (mat.length == 3) {
			int[][] d1 = new int[2][2];
			int[][] d2 = new int[2][2];
			int[][] d3 = new int[2][2];
			int matx = 0;
			int maty = 0;
			for (int dax = 0; dax < d1.length; dax++) {
				matx ++;
				for (int day = 0; day < d1.length; day++) {
					maty ++;
					d1[dax][day] = mat[matx][maty];
				}
				maty = 0;
			}
			matx = 0;
			maty = -2;
			for (int dax = 0; dax < d2.length; dax++) {
				matx ++;
				for (int day = 0; day < d2.length; day++) {
					maty += 2;
					if (maty == 3) {
						maty = 0;
					}
					d2[dax][day] = mat[matx][maty];
				}
				maty = -2;
			}
			matx = 0;
			maty = -1;
			for (int dax = 0; dax < d3.length; dax++) {
				matx ++;
				for (int day = 0; day < d3.length; day++) {
					maty ++;
					if (maty == 3) {
						maty = 0;
					}
					d3[dax][day] = mat[matx][maty];
				}
				maty = -1;
			}
			int D1 = computeDeterminantIterative(d1);
			int D2 = computeDeterminantIterative(d2);
			int D3 = computeDeterminantIterative(d3);
			int ad = mat[0][0];
			int bd = mat[0][1];
			int cd = mat[0][2];
			D1 = ad*(D1);
			D2 = bd*D2;
			D3 = cd*D3;
			int determ = D1 - D2 + D3;
			return determ;
		}
		if (mat.length >= 4) {
			int[] D = new int[4];
			int[][][] m = new int [4][3][3];
			int mx = 0;
			int my = -1;
			int  i = 0;
			for (int max = 0; max < mat.length-1; max++) {
				mx ++;
				for (int may = 0; may < mat.length-1; may ++) {
					my ++;
					m[i][max][may] = mat[mx][my];
				}
				my = -1;
			}
			mx = 0;
			my = 0;
			i = 1;
			for (int max = 0; max < mat.length-1; max++) {
				mx ++;
				for (int may = 0; may < mat.length-1; may ++) {
					my ++;
					m[i][max][may] = mat[mx][my];
				}
				my = 0;
			}
			mx = 0;
			my = -1;
			i = 2;
			for (int max = 0; max < mat.length-1; max++) {
				mx ++;
				for (int may = 0; may < mat.length-1; may ++) {
					my ++;
					if (my >= 4) {
						my -= 4;
					}
					if (my == 1) {
						my ++;
					}
					m[i][max][may] = mat[mx][my];
				}
				my = -1;
			}
			mx = 0;
			my = -1;
			i = 3;
			for (int max = 0; max < mat.length-1; max++) {
				mx ++;
				for (int may = 0; may < mat.length-1; may ++) {
					my ++;
					if (my >= 4) {
						my -= 4;
					}
					if (my == 2) {
						my ++;
					}
					m[i][max][may] = mat[mx][my];
				}
				my = -1;
			}
			for (int x = 0 ; x < 4; x++) {
				D[x] = computeDeterminantIterative(m[x]);
			}
			int det = (mat[0][0]*D[1]) - (mat[0][1] * D[2]) + (mat[0][2] * D[3]) - (mat[0][3] * D[0]);
			return det;
		}
		return 0;
	}
	public static void main (String[] args) throws IOException {
		int[][] n = readMatrix();
		for (int qrt = 0; qrt < n.length; qrt++) {
			for (int trq = 0; trq < n[qrt].length; trq ++) {
				System.out.print(n[qrt][trq] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(n));
		int Det = computeDeterminantIterative(n);
		System.out.print(Det);
	}
}