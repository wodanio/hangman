package de.hangman.event;

import java.util.Scanner;

public class event {

	public event() {
		
		Scanner s = new Scanner(System.in);
		int x;
		
	// Eingabe eines Buchstaben
	System.out.println("Wähle einen Buchstaben");
	
	x = s.nextInt();
	
	
	// Zahlen vermeiden
	char letter = 'A';
	String validChars = "abcdefghijklmnopqrstuvwxyz";
	char[] validCharsA = validChars.toCharArray();
	
	for ( int i = 0; i < validCharsA.length; i++ )
		if (letter == validCharsA[i] || letter == Character.toUpperCase(validCharsA[i]) ) {
			System.out.println("Das ist kein Buchstabe!");
		}
	}

}
