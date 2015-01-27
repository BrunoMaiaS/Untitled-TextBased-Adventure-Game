package game.main;

public class f
{
	
	public static boolean getYesOrNo(String question)
	{
		boolean var0 = false;
		String _correct; // Should contain `yes` or `no`.
		while (var0 == false) {
			a.w(question);
			_correct = a.r();
			_correct = _correct.toLowerCase(); // makes the string into it's
												// all lowercase equivalent;
			// Checks if the user wrote anything (like `yes` or `no`). If not, 
			//it will send an error message and skip all the code after the `continue;`.
			if (_correct.isEmpty()) {
				a.nw();
				continue;
			}
			// Checks if the first letter of the answer (should be `yes` or `no`) starts 
			// with a "y", which is the first letter of the word "yes".
			else if (_correct.charAt(0) == 'y') {
				var0 = true; // The loop will not loop after this itteration.
				return true; // this will stop the `while` and return the
								// player's name to whatever called it;
			}
			else if (_correct.charAt(0) == 'n')
			{
				var0 = false;
				return false;
			} else {
				a.wa(_correct);
				continue;
			}
		}
		return false;
	}

	// Requests a user input. Asks for their name.
	public static String getName() 
	{
		String _name = null;
		boolean var0 = false; // Should the while loop continue?
		while (var0 == false)
		{
			a.w("Please input name: ");
			_name = a.r(); // Makes `_name` the user's input.

			// Tests whether the name (put all in lowercase letters) is equal to
			// one of the creator's name.
			if (_name.equalsIgnoreCase("maxwell wever")
					|| (_name.equalsIgnoreCase("émile bolduc"))) {
				a.wl("Oh <censored> no, you ain't using my name!");
				// skips to the next itteration of the while loop without executing 
				//any code after the `continue;`.
				continue;
			}
			else if (_name.equalsIgnoreCase("buttball") || _name.equalsIgnoreCase("butt ball"))
			{
				a.w("What I'm going to do now is that I'm going to teach you how to play buttball..."); a.r();
				a.w("You feel a strange f*cking sensation."); a.r();
				game.die(deaths.DEATH_BUTTBALL);
			}
			
			if (!getYesOrNo("Your name is " + _name + ", right? [yes/no]: ")) { continue;} 
			else { return _name; }
		}
		return null;
	}
	
	/*public final static void clearConsole()
	{
		try
	    {
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows")) { Runtime.getRuntime().exec("cls"); }
	        else { Runtime.getRuntime().exec("clear"); }
	    }
	    catch (final Exception e) { e.printStackTrace(); }
	}*/
	
}
