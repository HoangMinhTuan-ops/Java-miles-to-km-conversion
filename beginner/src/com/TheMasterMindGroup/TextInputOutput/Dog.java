package com.TheMasterMindGroup.TextInputOutput;

public class Dog extends Animals {

	private String barking;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String barking) {
		this.barking = barking;
		
	}
	
	public Dog(String barking, String walk, String eat, String cuddle) {
		super(walk, eat, cuddle);
		setWalk(walk);
		setEat(eat);
		setCuddle(cuddle);
	}

	public String getBarking() {
		return barking;
	}

	public void setBarking(String barking) {
		this.barking = barking;
	}

	@Override
	public String toString() {
		return "Dog [barking=" + barking + ", getWalk()=" + getWalk() + ", getEat()=" + getEat() + ", getCuddle()="
				+ getCuddle() + "]";
	}
	
	
	
}
