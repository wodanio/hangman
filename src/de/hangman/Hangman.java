package de.hangman;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import de.hangman.wordManagement.wordManagement;



public class Hangman {
	
	public static void main(String[] args) throws Exception {

		wordManagement wm = new wordManagement( "input", "testWort" );
		
		System.out.println( wm.getWordArray() );
		
	}
			
					
}