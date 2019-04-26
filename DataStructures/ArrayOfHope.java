public class ArrayOfHope {
	public static void main (String[]args) {
		Character[] ch = new Character[26];
		for (int n = 0; n < 26; n++) {
			ch[n] = Character.toChars(n + 65)[0];
		}
		for (int poop = 0; poop < ch.length; poop++) {
			String s = ch[poop].toString();
			if (poop < ch.length-1) {
				s = s + ", ";
			}
			System.out.print("" + s);
		}
	}
}