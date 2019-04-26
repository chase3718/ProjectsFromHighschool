public class BMW{
	private double gallons;
	private double mpg;
	public BMW (int m){
		gallons = 0;
		mpg = m;
	}
	public void fillUp(double f){
		gallons += f;
	}
	public void takeTrip (double l){
		gallons -= (l / mpg);
	}
	public double reportFuel(){
		return gallons;
	}
	public static void main(String[]args){
		BMW car = new BMW(24);
		car.fillUp(20);
		car.takeTrip(100);
		double fuel_left = car.reportFuel();
		System.out.print(fuel_left);
	}
}