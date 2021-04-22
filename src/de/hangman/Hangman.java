package de.hangman;

<<<<<<< HEAD
import de.hangman.event.Event;
import de.hangman.windows.GameWindow;
import de.hangman.windows.StartWindow;
import de.hangman.wordManagement.wordManagement;
=======
import de.hangman.xyz.XYZ;

public class Hangman {
>>>>>>> c769026851b3220dfe7533712afa98b01c4a97d3

public class Hangman {
	
	/*private static char[] wordArray;
	
	private static StartWindow win_start;
	private static GameWindow win_main;
	private static wordManagement wm;
	private static Event ev;*/
	
	public static void main(String[] args) {
<<<<<<< HEAD
=======
		
		//System.out.print( "This is Hangman" );
		
		String way = "way1";
		
		XYZ worker = new XYZ( way );
		
		worker.doAnything( " yes test" );
		
		System.out.println( "New Stat: " + worker.getWay() );
>>>>>>> c769026851b3220dfe7533712afa98b01c4a97d3

		//win_start = new StartWindow();
		//win_main = new GameWindow();
		
		System.out.println( "TEST" );
		
	}
	
	public static void startGame ( String type, String value ) throws Exception {
		
		/*win_start.exit();
		
		wm = new wordManagement( type, value );
		wordArray = wm.getWordArray();
		
		//System.out.print( wordArray );
		
		win_main.startUp();*/
		
		//ev = new Event( win_main.main );
		
	}
	
	public static void action ( char letter ) {
		
		
		
	}
	
}