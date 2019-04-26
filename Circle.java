public class Circle{
	private double diameter;
	public Circle(double r){
		diameter = r * 2;
	}
	public double diameter(){
		return diameter;
	}
	public static void main (String[]args){
		Circle cir1 = new Circle(35.5);
		System.out.println( cir1.diameter( ) );
	}
}