package basic;

public class BasicArrays {

	public static void main(String[] args) {

		double[] myList = {1,8, 2.9, 3.4, 4.6, 2,1};
	
		sumArraysValues(myList);
		maxInArrays(myList);
		
		
		double[][] myMultiList = {
				{1, 2.3, 3.5},
				{4.4, 5, 6},
				{10.10, 11, 12},
		};
		printArraysValues(myMultiList);
	}
	
	private static void printArraysValues(double[][] myList) {
		
		for(int i = 0; i<myList.length; i++) {
			for(int j=0; j<myList.length; j++)
				System.out.println(myList[i][j]);
			
		}
	}
	
	public static void sumArraysValues(double[] myList) {
		
		double sum = 0;
		for(int i=0; i< myList.length; i++) {
			sum += myList[i];
		}
		System.out.println("The sum of the array is " + sum);
	}
	
	private static void maxInArrays(double[] myList) {
		
		double temp = 10;
		for(double value: myList) {
			if(value < temp) {
				temp = value;
			}
		}
		System.out.println("min is" + temp);
		}
}
	
