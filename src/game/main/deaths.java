package game.main;

import game.constructors.Death;
import game.types.DeathType;

public class deaths
{	
	
	public static Death DEATH_SATAN_DICE = new Death("A eerie light shines upon the silhouette, revealing Satan himself! His hoarse voice screams to you, \"YOU SHALL ROLL THESE DICE\".* He pulls out 2 monsterous dice and throws them at you, thus ending your pitiful life that didn't even get to start the real adventure.", DeathType.EVENT);
	
	public static Death DEATH_NOT_SET = new Death("No message for this death has been written yet.", DeathType.ENEMY_MONSTER);
	public static Death DEATH_TESTDEATH = new Death("You died from programming too hard.", DeathType.DEBUG); 
	public static Death DEATH_BUTTBALL = new Death("You were raped.", DeathType.UNKNOWN);
}
