package com.TheMasterMindGroup.AbstractClasses;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog germanShepart = new Dog();
		germanShepart.setBarking("Barking");
		germanShepart.setCuddle("Cudling");
		germanShepart.setEat("Give me food");
		germanShepart.setWalk("Running");
	
		Cats littleKitty = new Cats();
		littleKitty.setMeow("Meeeowww");
		
		displayAnimals(germanShepart);
		displayAnimals(littleKitty);
		
	}
	
	private static void displayAnimals(Animals animalObj) {
		
		
		System.out.println(animalObj.toString());
	
	}

}
