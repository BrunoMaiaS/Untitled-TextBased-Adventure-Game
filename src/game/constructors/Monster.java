package game.constructors;


public class Monster
{
	
	public String localized_name;
	public String name;
	public String death_message;
	
	public Monster(String _local_name, String _name, Death _death_type) { this.localized_name = _local_name; name = _name;
	this.death_message = _death_type.deathMessage; }
	
}
