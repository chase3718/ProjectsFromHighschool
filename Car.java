import java.io.*;
import java.util.*;
/*
//ints are primitive data types
//Strings are objects
*/
public class Car{
	//instance variable or instance field
	private String engine; //declaration
	private String color;
	private int numSeats;

	//constructor w/ parameters\\
	public Car(String e,String c,int s){
		engine = e;
		color = c;
		numSeats = s;
	}

	public String getEngine(){
		return engine;
	}

	public String getColor(){
		return color;
	}

	public int getSeats(){
		return numSeats;
	}

	public static void main(String[]args){
		Car c1 = new Car("v6","blue",8);
		Car c2 = new Car("I4","pink",1);
		System.out.print(c1.engine + " " + c1.color + " " + c1.numSeats + "\n" + c2.engine + " " + c2.color + " " + c2.numSeats);

	}
}