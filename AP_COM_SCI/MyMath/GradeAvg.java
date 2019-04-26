import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }

	int numGrades = 0;
	int sumGrades = 0;
	double avgGrade = 0;
	while (input.hasNextInt())
	{
		numGrades ++;
		sumGrades += input.nextInt();
		System.out.println
	}
	avgGrade = (double)sumGrades/numGrades;
	System.out.println("Your average is " + avgGrade + ".");
  }
}
