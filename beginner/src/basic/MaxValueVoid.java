package basic;

public class MaxValueVoid {

	public static void main(String[] args) {
		
		int firstValue = 12;
		int secondValue = 15;
			
		
		maxValue(firstValue, secondValue);
		
		

	}
	public static void maxValue(int firstParam, int secondParam) {
		
		int result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		System.out.println("the result is " + result);
	}
}
