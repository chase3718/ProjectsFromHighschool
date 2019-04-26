import java.io.*;
import java.util.*;
public class Lesson14{
	public static void main(String[]args){
		System.out.println("Decimal     Binary            Octal     Hex     Char");
		for(int j = 65; j <= 90; j++){
			System.out.println(j + "          " + Integer.toString(j,2)+"           "+Integer.toString(j,8) + "       " + Integer.toString(j,16)+"      "+ (char)(j));
		}
	}
}