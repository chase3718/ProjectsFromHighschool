import java.util.*;
public class Lesson1 {
	public static void main(String[]args){
		Calendar cal = new GregorianCalendar();
  		int month = cal.get(Calendar.MONTH) + 1;
  		int year = cal.get(Calendar.YEAR);
  		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("From: Bill Smith");
		System.out.println("Adress: Dell Computer, Bldg 13");
		System.out.println("Date: " + month + " " + day + ", " + year);
		System.out.println("");
		System.out.println("To: Jack Jones");
		System.out.println("");
		System.out.print("Message: Help! I'm trapped inside a computer!");
	}
}