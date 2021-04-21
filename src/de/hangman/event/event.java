package de.hangman.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;

import de.hangman.Hangman;

public class Event extends JFrame implements KeyListener {

	public Event(JFrame frame) {
		frame.addKeyListener(this);
		
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		// Zahlen vermeiden
		char letter = e.getKeyChar();
		String validChars = "abcdefghijklmnopqrstuvwxyz";
		char[] validCharsA = validChars.toCharArray();
		
		for ( int i = 0; i < validCharsA.length; i++ )
			if (letter == validCharsA[i] || letter == Character.toUpperCase(validCharsA[i]) ) {
				Hangman.action( letter );
			}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}