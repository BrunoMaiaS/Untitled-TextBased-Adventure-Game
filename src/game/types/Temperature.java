package game.types;

public enum Temperature
{
	
	UNBERABLY_HOT(75, "unberably hot"),
	SUPER_HOT(60, "super hot"),
	VERY_HOT(50, "very hot"),
	HOT(40, "hot"),
	WARM(30, "warm"),
	NORMAL(21, "cozy"),
	FRISK(10, "frisky"), 
	COLD(-1, "cold"),
	VERY_COLD(-30, "very cold"),
	SUPER_COLD(-50, "super cold"),
	UNBERABLY_COLD(-75, "unberably cold");
	
	public int temp;
	public String localized_name;
	private Temperature(int _temp, String _local_name)
	{
		this.temp = _temp;
		this.localized_name = _local_name;
	}

}
