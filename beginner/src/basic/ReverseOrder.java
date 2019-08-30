package basic;

public class ReverseOrder {

	public static void main(String[] args) {
	
		int[] myList = {1, 5, 8, 16};
		
		printReverseOrder(myList);
		
		}
	
	private static void printReverseOrder(int[] myList) {
		for(int i = myList.length - 1; i >= 0; i--) {
			System.out.println(myList[i]);
		}
			
	}
}
