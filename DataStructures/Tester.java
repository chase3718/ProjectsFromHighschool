import java.util.*;
public class Tester {
	public static void main (String[] args) {
		StackLL stck = new StackLL();
		System.out.println(stck.size());
		stck.push(157.3);
		stck.push(22.0);
		stck.push(-18.0);
		double j = stck.pop();
		System.out.println(j);
		System.out.println(stck.peek());
		System.out.println(stck.pop());
		System.out.println(stck.size());
		stck.clear();
		System.out.println(stck.size());

	}
}