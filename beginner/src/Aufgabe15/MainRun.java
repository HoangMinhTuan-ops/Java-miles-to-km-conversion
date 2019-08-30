package Aufgabe15;


public class MainRun {
	private static final String KundenName = null;
	public String KundeName;
	public String nameDerBank;
	public static void main(String[] args) {
		
		BankAccountApp ba1 = new BankAccountApp();
		BankAccountApp ba2 = new BankAccountApp();
		BankAccountApp ba3 = new BankAccountApp();
		ba1.KundeName = "Herr Pruin";
		ba1.nameDerBank = "Deutsche Bank";
		ba2.KundeName = "Herr Bauer";
		ba2.nameDerBank = "Commerzbank";
		ba3.KundeName = "Herr Glück";
		ba3.nameDerBank = "Uni Credit";
	
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		acc1.setKontostand(2344.87);
		acc1.setKreditlimit(2000.0);
		acc2.setKontostand(1900.0);
		acc2.setKreditlimit(3000.0);
		acc3.setKontostand(3400.0);
		acc3.setKreditlimit(0.0);
		
	
		
		System.out.println("Hallo" + ba1);
		System.out.println("Sie haben Ihr Konto erfolgreich eröffnet: ");
		System.out.println("Name der Bank: " + ba2);
		System.out.println("Ihr Kontostand: " + acc1);
		System.out.println("Kreditlimit: " + acc2);
		System.out.println("Wir freuen uns auf Ihren näschten Besuch!");
		System.out.println("*******************************************");
		
	}

}


