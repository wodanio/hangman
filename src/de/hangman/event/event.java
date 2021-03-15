package de.hangman.event;

import java.util.Scanner;

public class event {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String x;
		
	// Eingabe eines Buchstaben
	System.out.println("Wähle einen Buchstaben");
	
	x = s.next();
	
	System.out.println(x);
	}

}
