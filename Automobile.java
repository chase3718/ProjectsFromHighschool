public class Automobile{
	private double mpg;
	private double fuel;
	public Automobile (double m){
		mpg = m;
	}
	public void fillUp(double f){
		fuel = fuel + f;
	}
	public void takeTrip(double t){
		fuel = (fuel) - (t / mpg);
	}
	public double reportFuel(){
		return fuel;
	}
	public static void main(String[]args){
		Automobile myBmw = new Automobile(24);
		myBmw.fillUp(20);
		myBmw.takeTrip(100);
		double fuel_left = myBmw.reportFuel();
		System.out.print(fuel_left);
	}
}