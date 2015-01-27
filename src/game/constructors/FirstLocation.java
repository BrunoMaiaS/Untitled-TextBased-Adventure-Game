package game.constructors;

import game.types.Temperature;


public class FirstLocation extends Location
{
	
	private String arrivalMsg;
	private Monster[] monsters = null;
	
	public FirstLocation(String _local_name, String _name, Monster[] _mobs)
	{
		super(_name, _local_name, Temperature.NORMAL);
		this.monsters = _mobs; 
	}
	
	public FirstLocation(String _local_name, String _name, Monster[] _mobs, Temperature _temp)
	{
		super(_name, _local_name, _temp);
		this.monsters = _mobs; 
	}
	
	public void setArrivalMsg(String _msg) { arrivalMsg = _msg; }
	public String getArrivalMsg() { return arrivalMsg; }
	
	public void setMonsters(Monster[] _mobs) { this.monsters = _mobs; }
	public Monster[] getMonsters() { return this.monsters; }
	
	public void setTemperature(Temperature _temp) { this.temp = _temp; }
	public Temperature getTemperature() { return this.temp; }
	
}
