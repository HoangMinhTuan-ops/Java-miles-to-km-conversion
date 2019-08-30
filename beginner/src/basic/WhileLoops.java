package basic;

public class WhileLoops {

	public static void main(String[] args) {
		int mile = 1;
		double km;
		
		while (mile <= 10) {
			km = mile * 1.609344;
			System.out.println(mile + "mile = " + km + "km");
			mile++;
		}
		}
		
}
