import java.io.*;

public class StudentAverages {

	private String gradesFilename;

	public StudentAverages(String filename) {
		gradesFilename = filename;
	}

	public String printAverages() {
		try {

			FileInputStream fis = new FileInputStream(gradesFilename);
			byte[] bytes = new byte[1024];
			fis.read(bytes);
			String text = new String(bytes);
			fis.close();

			String[] lines = text.split("\n");
			String[] r = new String[lines.length-1];
		for(int i=0; i<lines.length-1;i++){
			String[] studentData = lines[i].split(" ");
			String name = studentData[0];
			int total = 0;
			int count = 0;
			for(int j=1; j<studentData.length-1; j++){
			int grade = Integer.parseInt(studentData[j]);
				total += grade;
				count++;
			}
			int average = total/count;
			//System.out.println(name + ", Average = " + average);
			r[i] = name + ", Average = " + average;
		}
		String l = "";
		for (int n = 0; n < r.length; n++) {
			l += r[n] + "\n";
			System.out.print(l);

		}
		return l;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main (String[] args) throws IOException{
		StudentAverages calc = new StudentAverages("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\StudentScores.in");
		//calc.printAverages();
		String q = calc.printAverages();
		System.out.print(q);
		FileWriter fw = new FileWriter("\\\\fs01\\STUDENTS\\HS\\williams.chase\\PROGRAMING\\Datain\\Scores.out");
		PrintWriter output = new PrintWriter(fw);
		output.print(q);
		output.close();
		fw.close();
	}
}