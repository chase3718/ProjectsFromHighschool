public class Kevin
{
	public int findProgress (int progNeeded, double progPerMonth) {
		int month = 0;
		int years = 0;
		double known = 0;
		double p = progPerMonth;
		double i = 100;
		while (known <= progNeeded) {
			month ++;
			known += i / p;

			i = 100 - known;
		}
		return month;
	}

	public static void main (String[] args) {
		int o = 95;
		Kevin x = new Kevin();
		System.out.print(x.findProgress(o,10));
	}
}