package de.hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class Hangman {
	
	public static void main(String[] args) throws Exception {
		File Wordliste = new File("src\\wortliste.txt");
		
		Scanner textScanner = new Scanner(Wordliste);
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> words = new ArrayList<>();
		while(textScanner.hasNextLine()) {
			words.add(textScanner.nextLine());
		}
		String hidden_text = words.get((int)(Math.random()*words.size()));
		char[] textArray = hidden_text.toCharArray();
		
		
			
		System.out.println(hidden_text.toCharArray());	
			}
			
					
				}	
	


