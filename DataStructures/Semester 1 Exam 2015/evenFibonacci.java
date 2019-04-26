public class evenFibonacci {
	public static void main (String[] args) {
		int[] evenFib = new int[50];
		int[] curFib = new int[50];
		curFib[0] = 1;
		curFib[1] = 2;
		int cur = 0;
		int sum = 0;
		for (int n = 2; n < curFib.length; n ++) {
			curFib[n] = curFib[n-1] + curFib[n-2];
		}

		for (int y = 0; y < curFib.length; y ++) {
			if (curFib[y] % 2 == 0) {
				if (curFib[y] < 4000000) {
					evenFib[cur] = curFib[y];
					cur ++;
				} else {
					y = curFib.length;
				}
			}
		}
		for (int x = 0; x < evenFib.length; x ++) {
			sum += evenFib[x];
		}
		System.out.println(sum);
	}
}