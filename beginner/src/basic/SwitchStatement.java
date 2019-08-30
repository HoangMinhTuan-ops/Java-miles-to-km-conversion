package basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		
		in = input.nextInt();
		
		if (in % 2 == 0) {
			System.out.println("that number " + in + " is even");
		}
		
		else {
			System.out.println("that number " + in + " is odd");
		}
	}
}


