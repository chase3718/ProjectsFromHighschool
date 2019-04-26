public class Lesson5 {
	public static void main(String[]args){
		double d1 = 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 = 18;
		System.out.println("Problem 1: " + (57.2 * (i1/i2)+ 1));
		System.out.println("Problem 2: " + (57.2 * ((double)i1/i2)+1));
		System.out.println("Problem 3: " + (15 - i1 * (d1*3)+4));
		System.out.println("Problem 4: " + (15 - i1 * (int)(d1*3)+4));
		System.out.println("Problem 5: " + (15 - i1 * ((int)d1*3)+4));
		mixed();
	}
	public static void mixed(){
		final double E = 2.718;
		System.out.println("1. " + E);
		final int NUM_STUDENTS = 236;
		System.out.println("2. " + NUM_STUDENTS);
		System.out.println("3. You must define a constant on one line");
		System.out.println("4. 27");
		System.out.println("5. 78");
		System.out.println("6. yes");
		System.out.println("7. 61/3.0");
		System.out.println("8. " + (double)(90/9));
		System.out.println("9. " + (4+6.0/4 + 5*3 - 3));
		int p = 3;
		double d = 10.3;
		int j = (int)5.9;
		System.out.println("10. " + (p + p*d-3*j));
		System.out.println("11. " + (p + p*(int)d-3*j));
		int dividend = 12, divisor = 4, qoutient = 0, remainder = 0;
		int dividend2 = 13, divisor2 = 3, qoutient2 = 0, remainder2 = 0;
		qoutient = dividend/divisor;
		remainder = dividend%divisor;
		qoutient2 = dividend2/divisor2;
		remainder2 = dividend2%divisor2;
		System.out.println("12. " + qoutient);
		System.out.println("13. " + remainder);
		System.out.println("14. " + qoutient2);
		System.out.println("15. " + remainder2);
		System.out.println("17. no");

	}
}