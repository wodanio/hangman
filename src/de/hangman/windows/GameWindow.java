package de.hangman.windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameWindow {
	
	private int wordLength = 0;
	
	public JFrame window;
	private JFrame end;
	
	public GamePanel GamePanel;
	public EndPanel EndPanel;
	
	public GameWindow () {
		
	}
	
	public void startUp () {
		
		this.init();
		
		this.window.setVisible(false);
		
	}
	
	public void show () {
		this.window.setVisible(true);
	}
	
	public void exit () {
		this.window.setVisible(false);
	}
	
	public void setWordLength( int length ) {
		this.wordLength = length;
	}
	
	public void delLetter ( String letter ) {
		for ( int i = 0; i < this.GamePanel.letters.length; i++ ) 
			if ( this.GamePanel.letters[i].getText().equals(letter) )
				this.GamePanel.letters[i].setForeground(Color.LIGHT_GRAY);
	}
	
	public void setLetter ( int pos, String letter ) {
		this.GamePanel.goal[ pos ].setText( letter );
	}
	
	public void setImageIcon ( ImageIcon imgIcon ) {
		this.GamePanel.imageicon.setIcon( imgIcon );
	}
	
	public void setPanel ( String name ) { // name: game|end
		
		if ( "game".equals( name ) ) {
			
			this.window.remove( this.EndPanel );
			this.window.add( this.GamePanel );
			
		} else if ( "end".equals( name ) ) {
			
			this.window.remove( this.GamePanel );
			this.window.add( this.EndPanel );
			
		}
		
		this.window.validate();
        this.window.repaint();
		
	}
	
	private void init () {
		
		//Fenster main erstellen
		this.window	= new JFrame("Hangman v2.2");
		
		// Window Panels
		this.GamePanel = new GamePanel( this.wordLength );
		this.EndPanel = new EndPanel();
		
		// Grundlagen Main Window
		this.window.setSize(700, 460);
		this.window.setLocationRelativeTo(null);
		this.window.setResizable(false);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		// add defautl GamePanel
	    this.window.add( this.GamePanel );
		
	}

}
