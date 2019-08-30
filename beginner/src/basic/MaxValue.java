package basic;

public class MaxValue {

	public static void main(String[] args) {
		
		int firstValue = 12;
		int secondValue = 8;
			
		
		int result = maxValue(firstValue, secondValue);
		
		System.out.println("the result is " + result);

	}
	public static int maxValue(int firstParam, int secondParam) {
		
		int result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		
		return result;
	}
}
