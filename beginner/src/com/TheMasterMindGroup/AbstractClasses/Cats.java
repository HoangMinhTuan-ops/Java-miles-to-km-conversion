package com.TheMasterMindGroup.AbstractClasses;

public class Cats extends Animals {

	private String meow;

	public Cats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cats(String meow) {
		this.meow = meow;
		
	}
	
	public Cats(String meow, String walk, String eat, String cuddle) {
		super(walk, eat, cuddle);
		setWalk(walk);
		setEat(eat);
		setCuddle(cuddle);
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	@Override
	public String toString() {
		return "Cats [meow=" + meow + ", animalsDescription()=" + animalsDescription() + "]";
	}

	@Override
	public String animalsDescription() {
		// TODO Auto-generated method stub
		return "Find boxes to fit in!";
	}


	
	
	
}
