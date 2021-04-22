package de.hangman;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import de.hangman.event.Event;
import de.hangman.graphic.Graphic;
import de.hangman.windows.GameWindow;
import de.hangman.windows.StartWindow;
import de.hangman.wordManagement.wordManagement;

public class Hangman {
	
	private static char[] wordArray, wordArrayCache;
	private static int writtenLetters = 0;
	private static int wrongLetters = 0;
	
	private static StartWindow win_start;
	private static GameWindow win_main;
	private static wordManagement wm;
	private static Event ev;
	private static Graphic graphic;
	
	public static void main(String[] args) {

		win_start = new StartWindow();
		win_main = new GameWindow();
		
	}
	
	/*
	 * complete game reload
	 */
	public static void reloadGame () {
		
		// change panel to game and rebuild letterview
		win_main.setPanel("game");
		win_main.GamePanel.buildLetters();
		
		// set counters to 0
		writtenLetters = 0;
		wrongLetters = 0;
		
		// exit game window and open start window 
		win_main.exit();
		win_start.show();
		
	}
	
	/*
	 * start the game, if there is an input
	 */
	public static void startGame ( String type, String value ) throws Exception {
		
		// exit start window
		win_start.exit();
		
		// new wordManager for get the correct word in the correct form
		wm = new wordManagement( type, value );
		wordArrayCache = wm.getWordArray();
		wordArray = wm.getWordArray();
		
		// new graphic manager for cout up the image
		graphic = new Graphic();
		
		// open the game window and give required objects
		// give the word length
		win_main.setWordLength( wordArray.length );		
		// do start up 
		win_main.startUp();
		// show window
		win_main.show();
		// give the first image
		win_main.setImageIcon( graphic.getFirst() );
		
		// start keylistener event for the game window
		ev = new Event( win_main.window );
		
	}
	
	/*
	 * the action process is a key is pressed for letters a to z
	 */
	public static void action ( char letter ) throws Exception {
		
		ArrayList list = letterInWord( letter );
		int letterNum = list.size();

		writtenLetters += letterNum;
		
		// set the color of letter in the letter list to light grey
		win_main.delLetter( String.valueOf( letter ) );
		
		if ( letterNum > 0 ) { // richtige Eingabe
			
			// set right letters in the lines
			list.stream()
				.forEach( o -> win_main.setLetter( (int) o, String.valueOf( letter ) ) );
			
			// replace letter in array with "-" for no retype able
			list.stream()
				.forEach( o -> wordArray[(int) o] = '-' );
			
			if ( writtenLetters == wordArray.length ) { // you win
				// change to end panel and show the win text
				win_main.setPanel("end");
				win_main.EndPanel.doWin();
			}
			
		} else { // falsche Eingabe
			
			wrongLetters++;
			
			// change to new image
			win_main.setImageIcon( graphic.getNext() );
			
			if ( wrongLetters >= 10 ) { // you win
				// change to end panel and show the faild text with correct word
				win_main.setPanel("end");
				win_main.EndPanel.doEnd( String.valueOf( wordArrayCache ) );
			}
		}
		
	}
	
	/*
	 * get the position of a letter in the word
	 */
	public static ArrayList letterInWord ( char letter ) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for ( int i = 0; i < wordArray.length; i++ )	
			if ( wordArray[i] == letter )
				list.add( i );
		return list;
	}
	
	public static boolean isWin () {
		// check for os windows
		return System.getProperty("os.name").toLowerCase().contains("win");
	}
	
}