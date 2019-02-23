public class Citizen
{
	private String[] classNames = {"Spirit", "EmoPsych", "Phys", "Soc", "Occup", "Intel"};
	private int class;
	private boolean living;

	public Citizen(int c)
	{
		class = c;
		living = true;
	}

	public String getClass()
	{
		return classNames[class];
	}

	public boolean getLiving()
	{
		return living;
	}
}