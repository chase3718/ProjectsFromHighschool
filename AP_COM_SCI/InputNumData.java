import java.io.*; //for File and IOException
import java.util.*;import java.util.*;
public class InputNumData
{
	public static void main(String args[]) throws IOException
	{
		Scanner sf = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\NumData.in"));
		int maxIndx = -1; //-1 so when we increment below, the first index is 0
		String text[] = new String[100]; //to be safe, declare more than we need
		while(sf.hasNext( ))
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine( );
		}
		//maxIndx is now the highest index of text[], = -1 if no text lines
		sf.close( ); //We opened a file above, so close it when finished.
		String answer = ""; //We will accumulate the answer string here.
		int sum; //accumulates sum of integers
		for(int j =0; j <= maxIndx; j++)
		{
			Scanner sc = new Scanner(text[j]);
			sum = 0; //important to set to 0; otherwise it will remember the last sum
			answer = ""; //otherwise it will remember last answer String
			while( sc.hasNext( ) ) //We could also have used hasNextInt( ) here
			{
				int i = sc.nextInt( );
				answer = answer + " + " + i;
				sum = sum + i;
			}
			answer = answer + " = " + sum;
			System.out.println(answer.substring(2,answer.length()));
		}
	}
}