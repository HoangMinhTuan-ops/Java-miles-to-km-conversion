package test;

import java.util.Scanner;

public class Implementieren {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input1 = new Scanner(System.in);
		String Produkt;
		System.out.println("Bitte die Versicherungsprodukte eingeben: ");
		Produkt = input1.nextLine();
		input1.close();
		
		Scanner input = new Scanner(System.in);
		double Wohnfl�che; 
		double Versicherungssumme;
		input.close();
		
		System.out.println("Bitte Ihre Wohnfl�che eingeben in m2: ");
		Wohnfl�che = input.nextDouble();
	
		if(Produkt.contains("Kompakt")) {
			Versicherungssumme = 650 * Wohnfl�che;
			System.out.println("die Versicherungssumme ist: " + Versicherungssumme);
		}
		
		else if (Produkt.contains("Optimal")) {
			Versicherungssumme = 700 * Wohnfl�che;
			System.out.println("die Versicherungssumme ist: " + Versicherungssumme);
		}
			
	}

}
