import java.io.*; //for File and IOException
import java.util.*; //necessary for Arrays.sort( ) and Scanner
public class SortNames
{
	public static void main(String args[]) throws IOException
	{
		Scanner sf = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\Names.in"));
		Scanner sq = new Scanner(new File("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\StudentScores.in"));
		int maxIndx = -1; //-1 so when we increment below, the first index is 0
		String text[] = new String[100]; //to be safe, declare more than we need
		while(sf.hasNext( ))
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine( );
		}
		//maxIndx is now the highest index of text[], = -1 if no text lines
		sf.close( ); //We opened a file above, so close it when finished.
		String reversedName[] = new String[maxIndx + 1];
		for (int j = 0; j <= maxIndx; j++)
		{
			Scanner sc = new Scanner( text[j] );
			String firstName = sc.next( );
			String lastName = sc.next( );
			reversedName[j] = lastName + ", " + firstName;
		}
		Arrays.sort(reversedName);
		for (int j =0; j <= maxIndx; j++)
		{
			System.out.println( reversedName[j] );
		}
	}
}