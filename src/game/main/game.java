package game.main;

import game.constructors.Configuration;
import game.constructors.Death;
import game.constructors.FirstLocation;

public class game
{
	
	public static Configuration config = null;
	public static String[] launch_args = null;
	
	
	//Loads the program.
	public static void main(String[] args)
	{
		launch_args = args;
		config = new Configuration();
		
		a.w("Welcome to <w/e> Text Adventure!");
		if (v.debug) { a.wl(" --DEBUG"); } else { a.wl(); }
		v.name = f.getName();
		a.wl("Hello " + v.name + "!");
		a.wl("You must roll the dice to determine where you'll go. There are 4 choices available to you.");
		
		boolean rtdanswer = f.getYesOrNo("Roll the dice? [yes/yes]: ");
		int _var0 = 0;
		while ( !rtdanswer && (_var0 <= 3))
		{
			switch (_var0)
			{
				case 0: a.wl("The dice is looking at you with eyes full of tears from your disgust for it. You want to make it feel better by rolling the dice. "); break;
				case 1: a.wl("The dice is now balling and the level of tears is rising. "); break;
				case 2: a.wl("The dice has cried so much that the ground level has risen to your neckline. "); break;
				case 3: a.wl("The dice has stopped crying and floats above the sea of tears. It remarks, \"You shall roll the dice now.\" A torrent of water slowly pulls an obscure aphotic silhouette from it.");
				default: if (_var0 == 4) { a.wl("This situation is unnacounted for. Max gets it."); }
			}
			rtdanswer = f.getYesOrNo("Roll the dice? [yes/yes]: ");
			if (!rtdanswer) { ++_var0; }
		}
		
		if (_var0 == 4) { v.last_name = v.name; die(deaths.DEATH_SATAN_DICE); }
		
		int biomePos = v.rand.nextInt(config.locations.length);
		FirstLocation _loc = (FirstLocation)config.locations[biomePos];
		a.wl(_loc.getArrivalMsg() + " " + f.genTempMsg(_loc));
		
	}
	
	
	public static void die(Death _death)
	{
		a.wl(_death.deathMessage);
		a.w("Press any key to restart... "); a.r();
		main(launch_args);
		//System.exit(0);
	}
	
}

/*
 * The dice sends you to the base of the volcano, a voice whispers, "You must ascend the volcano."
 * A chicken is stuck at the side of the road. You think to yourself, "Why won't the chicken cross the road?" *an overwhelming desire to kill the chicken comes over you*
 * Suddenly a congealed blob of lava appears in front of you. You know you need to defend yourself.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */