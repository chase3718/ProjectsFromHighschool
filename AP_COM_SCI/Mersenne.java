public class Mersenne {
	public static void main(String[] args) {
		int cp = 2;
		long cn = (int)(Math.pow(2,cp)-1);
		int pn = 0;
		int pnf = 6;
		boolean p = true;
		while(pn < pnf) {
			for (int f = 2; f <= (int)(Math.sqrt(cn)); f++) {
				if (cn % f == 0){
					p = false;
				}
			}
			if (p == true){
				System.out.println(cn*(int)Math.pow(2,cp-1));
				pn ++;
			}
			p = true;
			cp ++;
			cn = (int)(Math.pow(2,cp)-1);
		}
	}
}