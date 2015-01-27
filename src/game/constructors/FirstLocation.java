package game.constructors;

public class FirstLocation
{
	
	public String localized_name;
	public String name;
	private String arrivalMsg;
	private Monster[] monsters = null;
	
	public FirstLocation(String _local_name, String _loc_name, Monster[] _mobs) { this.localized_name = _local_name;
	this.name = _loc_name; this.monsters = _mobs; }
	
	public void setArrivalMessage(String _msg) { arrivalMsg = _msg; }
	public String getArrivalMessage() { return arrivalMsg; }
	
	public void setMonsters(Monster[] _mobs) { this.monsters = _mobs; }
	public Monster[] getMonsters() { return this.monsters; }
	
}
