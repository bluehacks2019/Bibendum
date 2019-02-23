public class Habits
{
	private String name;
	private int duration;
	private int frequency;
	private int daysPassed;
	private boolean currentStatus;
	private boolean finalStatus;

	public Habits(String n, int d, int f)
	{
		name = n;
		duration = d;
		frequency = f;
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

	public int getFrequency()
	{
		return frequency;
	}

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