public class nameCeleb {
	public static void main (String[]args){
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		int a = s1.length();
		String x = s1.substring(2, a - 3);
		int b = s2.length();
		String y = s2.substring(2, b - 3);
		int c = s3.length();
		String z = s3.substring(2, c - 3);
		System.out.println(s1 + ">>>" + x);
		System.out.println(s2 + ">>>" + y);
		System.out.print(s3 + ">>>" + z);
	}
}