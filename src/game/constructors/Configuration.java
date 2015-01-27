package game.constructors;

import game.main.deaths;
import game.main.f;
import game.types.Temperature;

public class Configuration
{
	
	public Configuration() { createMonsters(); }
	
	private void createMonsters()
	{
		this.chicken = new Monster("mob_chicken", "Chicken", deaths.DEATH_NOT_SET);
		this.bewbs = new Monster("mob_bewbs", "Lava slime", deaths.DEATH_NOT_SET);
		
		//initializeMonsterGroups();
		init();
	}
	
	/*private void initializeMonsterGroups()
	{
		volcano_mobs = new Monster[] { chicken, bewbs };
	}*/
	
	private void init()
	{
		this.loc_volcano = new FirstLocation("loc_volcano", "Volcano", new Monster[] { chicken, bewbs }, Temperature.VERY_HOT);
		this.loc_beach = new FirstLocation("loc_beach", "Beach", new Monster[] {}, Temperature.WARM);
		this.loc_forest = new FirstLocation("loc_forest", "Forest", new Monster[] {});		
		this.loc_tundra = new FirstLocation("loc_tundra", "Tundra", new Monster[] {}, Temperature.VERY_COLD);
		
		this.arrivalMessages();
	}
	
	private void arrivalMessages()
	{
		this.loc_volcano.setArrivalMsg(f.genArrivalMsg("You end up on the ", this.loc_volcano));
		this.loc_beach.setArrivalMsg(f.genArrivalMsg("You arrived at the ", this.loc_beach));
		this.loc_forest.setArrivalMsg(f.genArrivalMsg("You entered the ", this.loc_forest));
		this.loc_tundra.setArrivalMsg(f.genArrivalMsg("You end up in the ", this.loc_tundra));
		
		this.end();
	}
	
	private void end()
	{
		this.locations = new Location[] { this.loc_volcano, this.loc_beach, this.loc_forest, this.loc_tundra };
	}
	
	//Locations
	private FirstLocation loc_volcano;
	private FirstLocation loc_beach;
	private FirstLocation loc_forest;
	private FirstLocation loc_tundra;
	public Location[] locations;
	
	//Monsters
	public Monster chicken;
	public Monster bewbs;
	
	//Monster arrays
	//public Monster[] volcano_mobs;
	//public Monster[] beach_mobs;
	//public Monster[] volcano_mobs;
	//public Monster[] volcano_mobs;
}
