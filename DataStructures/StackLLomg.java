import java.util.*;
public class StackLL implements StackIntrfc {
	private LinkedList<Double> LL;
	public StackLL() {
		LL = new LinkedList<Double>();
	}
	public void push(double d) {
		LL.push(d);
	}
	public double pop() {
		return LL.pop();
	}
	public double peek() {
		return LL.peek();
	}
	public int size() {
		return LL.size();
	}
	public void clear() {
		LL.clear();
	}
	public void add() {
		LL.push(LL.pop() + LL.pop());
	}
	public void subtract() {
		LL.push(-LL.pop() + LL.pop());
	}
	public void multiply() {
		LL.push(LL.pop() * LL.pop());
	}
	public void divide() {
		LL.push(1/LL.pop() * LL.pop());
	}
}