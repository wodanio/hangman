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
	
	private JLabel imageicon;
	private JLabel[] goal;
	private JLabel[] letters;
	
	public GameWindow () {
		
	}
	
	public void startUp () {
		
		this.init();
		
		this.window.setVisible(true);
		
	}
	
	public void setWordLength( int length ) {
		this.wordLength = length;
	}
	
	public void delLetter ( String letter ) {
		for ( int i = 0; i < this.letters.length; i++ ) 
			if ( this.letters[i].getText().equals(letter) )
				this.letters[i].setForeground(Color.LIGHT_GRAY);
	}
	
	public void setLetter ( int pos, String letter ) {
		this.goal[ pos ].setText( letter );
	}
	
	public void setImageIcon ( ImageIcon imgIcon ) {
		this.imageicon.setIcon( imgIcon );
	}
	
	private void init () {
		
		//Fenster main erstellen
		this.window	= new JFrame();
		this.end 	= new JFrame();
		
		// Grundlagen Main Window
		this.window.setSize(440, 460);
		this.window.setLocationRelativeTo(null);
		this.window.setResizable(false);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ab Hier: Content ins Fenster
	    Container cp = this.window.getContentPane();
	    cp.setLayout(null);
	    
  		JPanel grafikpanel = new JPanel();
  		grafikpanel.setBounds(120, 5, 200, 200);
  		JPanel buchstabenpanel1 = new JPanel();
  		buchstabenpanel1.setBounds(20, 320, 420, 40);
  		JPanel buchstabenpanel2 = new JPanel();
  		buchstabenpanel2.setBounds(2, 360, 420, 50);
  		JPanel wortpanel = new JPanel();
  		wortpanel.setBounds(10, 220, 425, 50);
  		
  		this.imageicon = new JLabel();
  		this.imageicon.setVisible(true);
		
		grafikpanel.add(this.imageicon);
		
		//Buchstaben erstellen
		String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		this.letters = new JLabel[26];
	    buchstabenpanel1.setLayout(new BoxLayout(buchstabenpanel1, BoxLayout.X_AXIS));
	    for (int i = 0; i < 14; i++) {
	    		this.letters[i] = new JLabel(abc[i]);
		    	Font font = new Font("Arial", Font.PLAIN, 42);
		    	this.letters[i].setFont(font);
		        buchstabenpanel1.add(this.letters[i]);
		};
	    for (int i = 14; i < 26; i++) {
	    		this.letters[i] = new JLabel(abc[i]);
	    		Font font = new Font("Arial", Font.PLAIN, 42);
	    		this.letters[i].setFont(font);
		        buchstabenpanel2.add(this.letters[i]);
	    };
	  		
	   
		this.goal = new JLabel[this.wordLength];
		for(int i = 0; i < this.wordLength; i++) {
			this.goal[i] = new JLabel("_");
		Font font = new Font("Arial", Font.PLAIN, 42);
			this.goal[i].setFont(font);
			wortpanel.add(goal[i]);
		}
	    
	    this.window.add(grafikpanel);
		this.window.add(wortpanel);
		this.window.add(buchstabenpanel1);
		this.window.add(buchstabenpanel2);
		
	}

}
