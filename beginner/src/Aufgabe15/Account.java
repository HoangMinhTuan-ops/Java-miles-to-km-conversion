package Aufgabe15;

public class Account extends BankAccountApp{

	private double Kontostand;
	private double Kreditlimit;
	
		public Account() {

	}

		public double getKontostand() {
			return Kontostand;
		}

		public void setKontostand(double kontostand) {
			Kontostand = kontostand;
		}

		public double getKreditlimit() {
			return Kreditlimit;
		}

		public void setKreditlimit(double kreditlimit) {
			Kreditlimit = kreditlimit;
		}
		public String toString() {
			return "Kontostand: " + Kontostand;
		}
}
