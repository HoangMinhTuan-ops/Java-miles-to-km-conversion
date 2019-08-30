package basic;

public class MaxValueOverloading {

	public static void main(String[] args) {
		
		int firstValue = 12;
		int secondValue = 8;
			
		
		int result = maxValue(firstValue, secondValue);
		
		System.out.println("the result is " + result);

		
		double firstValueDouble = 66.6;
		double secondValueDouble = 44.7;
		
		double resultDouble = maxValue(firstValueDouble, secondValueDouble);
		System.out.println("the result in double is " + resultDouble);
	
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
	
	public static double maxValue(double firstParam, double secondParam) {
	
		double result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		
		return result;
}
	
}
