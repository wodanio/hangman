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
		
		
<<<<<<< HEAD
<<<<<<< HEAD
		int test = 1 + 1;

		System.out.println( test );
		
=======
		System.out.print( "This is Hangman" );
>>>>>>> 13470ed68abbb4f158cf6287895ad44d74873cd9
	}
=======
			
		System.out.println(hidden_text.toCharArray());	
			}
			
					
				}	
	

>>>>>>> e2fd2452df4e76d3b07ae337ac6f3881ae3a1dc6

