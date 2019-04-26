public class BinarySearch{
	public static void main(String args[]){
		//int i[] = {97,95,89,84,81,78,67,51,49,43,22,21,15,-7};
		int i[] = {-7,15,21,22,43,49,51,67,78,81,84,89,95,97};
		System.out.println(BinarySearch(i, 22)); //prints 3
		System.out.println(BinarySearch(i, 89)); //prints 11
		System.out.println(BinarySearch(i, -100)); //prints -1
		System.out.println(BinarySearch(i, 72)); //prints -1
		System.out.println(BinarySearch(i, 102)); //prints -1
	}
	//Look for srchVal in the a[] array and return the index of where it’s found
	//Return –1 if not found
	/*public static void main(String args[]){
		int i[] = {-7, 15, 21, 22, 43, 49, 51, 67, 78, 81, 84, 89, 95, 97};
		Integer iw[] = new Integer[14];
		for(int k = 0; k < 14; k++){
			iw[k] = i[k]; //pre Java 5.0 iw[k] = new Integer(i[k]);
		}
		System.out.println(BinarySearch(iw, 22)); //3
//pre Java 5.0, System.out.println(binarySearch(iw, new Integer(22)));
		System.out.println(BinarySearch(iw, 89)); //11
		System.out.println(BinarySearch(iw, -100)); //-1
		System.out.println(BinarySearch(iw, 72)); //-1
		System.out.println(BinarySearch(iw, 102)); //-1
	}*/
	private static int BinarySearch(int a[], int srchVal) {
		int lb = 0;
		int ub = a.length - 1;
		while(lb <= ub) {
			int mid = (lb + ub)/2;
			if(a[mid] == srchVal){
				return mid;
			} else if (srchVal > a[mid]) {
				lb = mid + 1; //set a new lowerbound
			} else {
				ub = mid -1; //set a new upper bound
			}
		}
		return -1; //srchVal not found
	}
}
