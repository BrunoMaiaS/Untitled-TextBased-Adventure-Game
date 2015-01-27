package game.constructors;

public class Configuration
{
	
	public Configuration() { createMonsters(); init(); }
	
	private void createMonsters()
	{
		this.chicken = new Monster("mob_chicken", "Chicken");
		this.bewbs = new Monster("mob_bewbs", "Lava slime");
		
		initializeMonsterGroups();
	}
	
	private void initializeMonsterGroups()
	{
		volcano_mobs = new Monster[] { chicken, bewbs };
	}
	
	private void init()
	{
		this.loc_volcano = new FirstLocation("loc_volcano", "Volcano", this.volcano_mobs);
		this.loc_volcano.setArrivalMessage("You end up on the " + this.loc_volcano.name.toLowerCase());
	}
	
	//Locations
	public FirstLocation loc_volcano;
	
	//Monsters
	public Monster chicken;
	public Monster bewbs;
	
	//Monster arrays
	public Monster[] volcano_mobs;
}
