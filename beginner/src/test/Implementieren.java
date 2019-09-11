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
		double Wohnfläche; 
		double Versicherungssumme;
		input.close();
		
		System.out.println("Bitte Ihre Wohnfläche eingeben in m2: ");
		Wohnfläche = input.nextDouble();
	
		if(Produkt.contains("Kompakt")) {
			Versicherungssumme = 650 * Wohnfläche;
			System.out.println("die Versicherungssumme ist: " + Versicherungssumme);
		}
		
		else if (Produkt.contains("Optimal")) {
			Versicherungssumme = 700 * Wohnfläche;
			System.out.println("die Versicherungssumme ist: " + Versicherungssumme);
		}
			
	}

}
