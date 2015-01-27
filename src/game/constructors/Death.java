package game.constructors;

import game.types.DeathType;

public class Death
{
	
	public DeathType type;
	public String deathMessage;
	
	public Death(String _msg, DeathType _type)
	{
		this.deathMessage = _msg;
		this.type = _type;
	}
}
