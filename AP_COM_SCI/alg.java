public class alg {
	private static boolean findPrime (int number) {
		for (int n = 2; n < (number / 2); n++) {
			if (number % n == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main (String []args) {
		int n = 7;
		System.out.println(n);
		boolean p = findPrime(n);
		System.out.print(p);
	}
}