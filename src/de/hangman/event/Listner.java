package de.hangman.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Listner extends JFrame implements KeyListener {
public Listner (JFrame frame) {
frame.addKeyListener(this);
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hat geklappt");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
