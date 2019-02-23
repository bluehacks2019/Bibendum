package com.bibendum.bluehacks.bibendum;

public class Citizen {
	private String[] classNames = {"Spirit", "EmoPsych", "Phys", "Soc", "Occup", "Intel"};
	private int classs;
	private boolean living;

	public Citizen(int c) {
		classs = c;
		living = true;
	}

	public String getClasss() {
		return classNames[classs];
	}

	public boolean getLiving()
	{
		return living;
	}
}