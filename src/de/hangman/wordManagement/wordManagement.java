package de.hangman.wordManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import de.hangman.Hangman;

public class wordManagement {
	
	private String type; // [input;random] Working Type (Wort wird eingegebnen oder random wort)
	
	private String word; // ? input word
	
	public wordManagement ( String type, String word ) {
		this.type = type;				// Position
		this.word = word;				// Buchstabe/ Wort
	}
	
	private char[] checkInput () {
		
		return this.word.toCharArray();
		
	}
	
	private char[] genRandomWord () throws Exception {
		
		File Wordliste;
		
		// chance paht if the os is windows or not
		if ( Hangman.isWin() )
			Wordliste = new File("src\\de\\hangman\\wordManagement\\wortliste.txt");
		else
			Wordliste = new File("src/de/hangman/wordManagement/wortliste.txt");
		
		// scanner for word list
		Scanner textScanner = new Scanner(Wordliste);
		
		// read word list
		ArrayList<String> words = new ArrayList<>();
		while(textScanner.hasNextLine()) {
			words.add(textScanner.nextLine());
		}
		// select a random word
		String hidden_text = words.get((int)(Math.random()*words.size()));
		
		return hidden_text.toCharArray();
		
	}
	
	private char[] toUpperCase ( char[] arr ) {
		
		// do uppercase with all chars		
		for ( int i = 0; i < arr.length; i++ )
			arr[i] = Character.toUpperCase( arr[i] );
		
		return arr;
	}
	
	public char[] getWordArray () throws Exception {
		
		// switch between random word and inputed word
		if ( "manual".equals( this.type ) ) {
			return this.toUpperCase( this.checkInput() );
		} else if ( "auto".equals( this.type ) )  {
			return this.toUpperCase( this.genRandomWord() );
		}
		
		return null;
		
	}

}
