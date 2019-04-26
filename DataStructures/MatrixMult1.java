public class MatrixMult {
	public static void main (String[]args) {
		int a[][] = new int[][]{{1,2,-2,0},
								{-3,4,7,2},
								{6,0,3,1}};
		int b[][] = new int[][]{{-1,3},
								{0,9},
								{1,-11},
								{4,-5}};
		int c[][] = new int[a.length][b[0].length];
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < b[0].length; y++) {
				for (int z = 0; z < b.length; z++) {
					c[x][y] += a[x][z] * b[z][y];
				}
			}
		}
		for (int m = 0; m < c.length; m++) {
			for (int n = 0; n < c[m].length; n++) {
				System.out.print(c[m][n] + " ");
			}
			System.out.println("");
		}
	}
}