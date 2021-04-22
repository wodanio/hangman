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
	
	private static char[] wordArray;
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
	
	public static void reloadGame () {
		
		win_main.setPanel("game");
		win_main.GamePanel.buildLetters();
		
		writtenLetters = 0;
		wrongLetters = 0;
		
		win_main.exit();
		win_start.show();
		
	}
	
	public static void startGame ( String type, String value ) throws Exception {
		
		win_start.exit();
		
		wm = new wordManagement( type, value );
		wordArray = wm.getWordArray();
		
		graphic = new Graphic();
		
		win_main.setWordLength( wordArray.length );		
		win_main.startUp();
		win_main.show();
		win_main.setImageIcon( graphic.getFirst() );
		
		ev = new Event( win_main.window );
		
	}
	
	public static void action ( char letter ) throws Exception {
		
		ArrayList list = letterInWord( letter );
		int letterNum = list.size();
		
		writtenLetters += letterNum;
		
		win_main.delLetter( String.valueOf( letter ) );
		
		if ( letterNum > 0 ) { // richtige Eingabe
			
			list.stream()
				.forEach( o -> win_main.setLetter( (int) o, String.valueOf( letter ) ) );
			
			list.stream()
				.forEach( o -> wordArray[(int) o] = '-' );
			
			if ( writtenLetters == wordArray.length ) { // you win
				win_main.setPanel("end");
				win_main.EndPanel.doWin();
			}
			
		} else { // falsche Eingabe
			
			wrongLetters++;
			
			win_main.setImageIcon( graphic.getNext() );
			
			if ( wrongLetters >= 10 ) { // you win
				win_main.setPanel("end");
				win_main.EndPanel.doEnd();
			}
		}
		
	}
	
	public static ArrayList letterInWord ( char letter ) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for ( int i = 0; i < wordArray.length; i++ )	
			if ( wordArray[i] == letter )
				list.add( i );
		return list;
	}
	
	public static boolean isWin () {
		return System.getProperty("os.name").startsWith("Windows");
	}
	
}