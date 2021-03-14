package de.hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Hangman {
	
	public static void main(String[] args) throws Exception {
		File Wordliste = new File("D:\\Daten\\Tobias\\Informatik 12T3\\wortliste.txt");
		
		Scanner textScanner = new Scanner(Wordliste);
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<>();
		while(textScanner.hasNextLine()) {
			words.add(textScanner.nextLine());
		}
		String hidden_text = words.get((int)(Math.random()*words.size()));
		char[] textArray = hidden_text.toCharArray();
		
		char[] myAnswers = new char[textArray.length];
		for(int i = 0; i < textArray.length; i++) {
			myAnswers[i] = '?';
		}
		boolean finished = false;
				
		while(finished == false) {
			System.out.println("**************************");
			
			String letter = input.next();
			//Auf Eingabe überprüfen
			while(letter.length() != 1|| Character.isDigit(letter.charAt(0))) {
				System.out.println("Falscher Buchstabe - Versuchs erneut :) ");
				letter = input.next();
			}
			//Schauen ob der Buchstabe im Wort ist
			
		}
	}

}
