public class PerfectNumbers {
	public static void main(String[] args) {
		int pnf = 0;
		int pn = 4;
		int cn = 1;
		int sum = 0;
		while (pnf < pn) {
			for (int f = 1; f <= cn; f++) {
				if (cn % f == 0 && cn != f) {
					sum += f;
				}

			}
			System.out.println(cn);
			if (sum == cn) {
				System.out.println( " is a perfect number");
				pnf ++;
			}

			cn++;
			sum = 0;
		}
	}
}