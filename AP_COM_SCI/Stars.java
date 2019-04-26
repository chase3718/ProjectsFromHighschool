
public class Stars {
	public Stars (int num) {
		int sum = 0;
		int rowNum = 1;
		int x = 0;
		int y = 0;
		for (int n = 0; n < num; n++) {
			while (y < (num*2 - n * 2)/2) {
				System.out.print(" ");
				y ++;
			}
			while (x < n * 2 + 1) {
				System.out.print("*");
				x ++;
			}
			x = 0;
			y = 0;
			System.out.println("");
		}

	}
	public static void main(String[] args) {
		Stars n = new Stars(10);
	}
}