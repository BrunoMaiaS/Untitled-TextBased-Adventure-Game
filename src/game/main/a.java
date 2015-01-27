package game.main;
import java.util.Scanner;

public class a
{
	public static void w(Object _obj) { System.out.print(_obj); }
	
	/** Prints a new line. **/
	public static void wl() { System.out.print(""); }
	/** Prints a new line containing the input string 
	 * @param _obj What to have the console print. **/
	public static void wl(Object _obj) { System.out.println(_obj); }
	
	public static void nw() { a.wl("You wrote nothing!"); }
	/** Prints a `"_var0" is not a valid answer!`.
	 * @param _var0 What is the wrong user's answer. **/
	public static void wa(String _var0) { a.wl('"' + _var0 + "\" is not a valid answer!"); }
	
	/** Reads the user's input. **/
	public static String r()
	{
		String _finaloutput = null;
		try
		{
			@SuppressWarnings("resource")
			Scanner _scanner = new Scanner(System.in);
			_finaloutput = _scanner.nextLine();
		}
		catch (Exception e)
		{
			//There was an error converting the user's input into a readable format.
			e.printStackTrace();
		}
		return _finaloutput;
	}
}
