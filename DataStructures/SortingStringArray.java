import java.util.*;
public class SortingStringArray {
	public static void main(String[]args) {
		String[] ss = {"Bill","Mary","Lee","Agnes","Alfred","Thomas","Alvin","Bernard","Ezra","Herman"};
		Arrays.sort(ss);
		for (int n = 0; n < ss.length; n++) {
			System.out.println(ss[n]);
		}
	}
}
