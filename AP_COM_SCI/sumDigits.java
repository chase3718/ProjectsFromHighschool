public class sumDigits {
	public int Digits (int num) {
		int g = Math.abs(num);
		int nDig = 0;
		int dig = 1;
		int sum = 1;
		while ((int)Math.pow(10,nDig) <= g) {
			nDig ++;
		}
		for (int n = 1; n < nDig; n++) {
			sum += g%10;
			g -= g%10;
			g /= 10;
		}
		return sum;
	}
	public static void main (String [] args) {
		sumDigits x = new sumDigits();
		System.out.print(x.Digits(1234));
	}
}