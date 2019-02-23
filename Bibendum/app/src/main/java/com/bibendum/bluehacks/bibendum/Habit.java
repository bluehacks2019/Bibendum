package com.bibendum.bluehacks.bibendum;

import java.util.Date;

import io.realm.RealmObject;

public class Habit extends RealmObject {
	private String name;
	private int duration;
	private int frequency;
	private int daysPassed;
	private Date start;
	private boolean currentStatus;
	private boolean finalStatus;

	public Habit(String n, int d, int f, Date date) {
		name = n;
		duration = d;
		frequency = f;
		start = date;
	}

	public String getName()
	{
		return name;
	}

	public int getDaysPassed()
	{
		return daysPassed;
	}

	public void addDay()
	{
		daysPassed++;
	}

	public int getDuration() { return duration; }

	public int getFrequency()
	{
		return frequency;
	}

	public Date getStartDate() { return start; }

	public int getDaysLeft()
	{
		return duration - daysPassed;
	}

	public boolean getCurrentStatus()
	{
		return currentStatus;
	}

	public boolean getFinalStatus()
	{
		return finalStatus;
	}
}