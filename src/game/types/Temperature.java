package game.types;

public enum Temperature
{
	
	UNBERABLY_HOT(75, "unberablyhot", "unberably hot"),
	VERY_HOT(50, "veryhot", "very hot"), SUPER_HOT(60, "superhot", "super hot"),
	WARM(30, "warn", "warm"), HOT(40, "hot", "hot"),
	NORMAL(21, "normal", "cozy"),
	FRISK(10, "frisky", "frisky"), COLD(-1, "cold", "cold"),
	VERY_COLD(-30, "verycold", "very cold"), SUPER_COLD(-50, "supercold", "super cold"),
	UNBERABLY_COLD(-75, "unberablycold", "unberably cold");
	
	@SuppressWarnings("unused")
	public int temp;
	public String name;
	public String localized_name;
	private Temperature(int _temp, String _name, String _local_name)
	{
		this.temp = _temp;
		this.name = _name;
		this.localized_name = _local_name;
	}

}
