package de.hangman;

import de.hangman.xyz.XYZ;

public class Hangman {

	public static void main(String[] args) {
		
		//System.out.print( "This is Hangman" );
		
		String way = "way1";
		
		XYZ worker = new XYZ( way );
		
		worker.doAnything( " yes test" );
		
		System.out.println( "New Stat: " + worker.getWay() );

	}

}
