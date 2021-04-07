package de.hangman.wordManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class wordManagement {
	
	private String type; // [input;random] Working Type (Wort wird eingegebnen oder random wort)
	
	private String word; // ? mitgegebenes wort
	
	public wordManagement ( String type ) {
		this.type = type;
	}
	
	public wordManagement ( String type, String word ) {
		this.type = type;
		this.word = word;
	}
	
	private char[] checkInput () {
		
		return this.word.toCharArray();
		
	}
	
	private char[] genRandomWord () throws Exception {
		
		File Wordliste = new File("src\\wortliste.txt");
		
		Scanner textScanner = new Scanner(Wordliste);
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<>();
		while(textScanner.hasNextLine()) {
			words.add(textScanner.nextLine());
		}
		String hidden_text = words.get((int)(Math.random()*words.size()));
		
		return hidden_text.toCharArray();
		
	}
	
	public char[] getWordArray () throws Exception {
		
		if ( "input".equals( this.type ) ) {
			return this.checkInput();
		} else if ( "random".equals( this.type ) )  {
			return this.genRandomWord();
		}
		
		return null;
		
	}

}
