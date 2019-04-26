public class Supercalifragilisticexpialidocious{
	public static void main(String[]args){
		int y[] = new int[100];
		boolean prime = true;
		String primeT = "- Is Prime";
		for(int x = 1; x < 1234567; x++){
			for(int z = 2; z < Math.ceil(Math.sqrt(x))+1 && z < x; z++){
				if(x % z == 0){
					prime = false;
					primeT = "- Is Not Prime";
					z = x;
				}
			}
			System.out.println(x + " " + primeT);
			prime = true;
		   primeT = "- Is Prime";
		}

	}
}