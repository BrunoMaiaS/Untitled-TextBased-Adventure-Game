package game.constructors;

import game.types.Temperature;

public class Location
{
	
	public String localized_name;
	public String name;
	public Temperature temp;
	
	public Location(String _name, String _local_name, Temperature _temp) { this.localized_name = _name;
	this.name = _local_name; temp = _temp; }
}
