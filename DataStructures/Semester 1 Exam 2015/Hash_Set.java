import java.util.*;

public class Hash_Set {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		Set s1 = new HashSet();
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");

		Set s2 = new HashSet();
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");

		Set s3 = new HashSet();

		s1.addAll(s2);

		Iterator iter1 = s1.iterator();
		while (iter1.hasNext()){
			System.out.println(iter1.next());
		}
	}
}