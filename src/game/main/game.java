package game.main;

import game.constructors.Configuration;

public class game
{
	
	public static Configuration config;
	public static String[] launch_args;
	
	//Loads the program.
	public static void main(String[] args)
	{
		launch_args = args;
		config = new Configuration();
		
		a.w("Welcome to <w/e> Text Adventure!");
		if (v.debug) { a.wl(" --DEBUG"); } else { a.wl(); }
		v.name = f.getName();
		a.wl("Hello " + v.name + "!");
		a.wl("You must roll the dice. ");
		boolean firstRTDanswer = f.getYesOrNo("Roll the dice? [yes/yes]: ");
		int _var0 = 0;
		while ((!firstRTDanswer) && (_var0 < 4)) { 
			a.wl("The dice is looking at you with eyes full of tears from your disgust for it. "
					+ "You want to make it feel better by rolling the dice. ");
			firstRTDanswer = f.getYesOrNo("Roll the dice? [yes/yes]: "); ++_var0; }
		
		if (_var0 == 4) { die(deaths.DEATH_TESTDEATH); }
		
		a.wl("You face a " + config.loc_volcano.getMonsters()[v.rand.nextInt(2)].name.toLowerCase());
		
	}
	
	public static void die(String _death_msg)
	{
		a.wl(_death_msg);
		a.w("Press any key to restart... "); a.r();
		//f.clearConsole();
		a.wl();
		main(launch_args);
	}
	
}

/* == WHAT HAPPENS WHEN YOU <DON'T ROLL THE DICE> 5 TIMES ==
 * The dice is now fully in tears and the ground around you is slowly rising in tears. Roll the dice?
 * The dice has cried so much that the ground level has risen to your neckline. Roll the dice?
 * The dice has stopped crying and floats above the sea of tears. It remarks, "You shall roll the dice now." A torrent of water slowly pulls an obscure aphotic silhouette from it. Roll the dice?
 * A eerie light shines upon the silhouette; revealing Satan himself! His hoarse voice screams to you, "YOU SHALL ROLL THESE DICE" *He pulls out 2 monsterous dice and throws them at you, thus ending your pitiful life that didn't even get to start the real adventure.
 */

/*
 * The dice sends you to the base of the volcano, a voice whispers, "You must ascend the volcano."
 * A chicken is stuck at the side of the road. You think to yourself, "Why won't the chicken cross the road?" *an overwhelming desire to kill the chicken comes over you*
 * Suddenly a congealed bl
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */