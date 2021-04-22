package de.hangman.windows;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private int wordLength = 0;
	
	private JPanel grafikpanel, buchstabenpanel1, buchstabenpanel2, wortpanel;
	
	public JLabel imageicon;
	public JLabel[] goal;
	public JLabel[] letters;	
	
	public GamePanel ( int wordLength ) {
		this.wordLength = wordLength;
		
		setLayout(null);
		
		this.grafikpanel = new JPanel();
		this.grafikpanel.setBounds(250, 5, 200, 200);
		this.buchstabenpanel1 = new JPanel();
		this.buchstabenpanel1.setBounds(20, 320, 660, 50);
		this.buchstabenpanel2 = new JPanel();
		this.buchstabenpanel2.setBounds(20, 360, 660, 50);
		this.wortpanel = new JPanel();
		this.wortpanel.setBounds(10, 220, 680, 50);
  		
  		this.imageicon = new JLabel();
  		this.imageicon.setVisible(true);
		
  		this.grafikpanel.add(this.imageicon);
		
		//Buchstaben erstellen
		this.buildLetters();
	  		
		this.buildWortpanel();		
	    
	    add(this.grafikpanel);
		add(this.wortpanel);
		add(this.buchstabenpanel1);
		add(this.buchstabenpanel2);
		
	}
	
	public void buildWortpanel () {
		
		this.goal = new JLabel[this.wordLength];
		for(int i = 0; i < this.wordLength; i++) {
			this.goal[i] = new JLabel("_");
		Font font = new Font("Arial", Font.PLAIN, 42);
			this.goal[i].setFont(font);
			this.wortpanel.add(goal[i]);
		}
		
	}
	
	public void buildLetters () {
		
		String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		this.letters = new JLabel[26];
		//this.buchstabenpanel1.setLayout(new BoxLayout(this.buchstabenpanel1, BoxLayout.X_AXIS));
	    for (int i = 0; i < 14; i++) {
	    		this.letters[i] = new JLabel(abc[i]);
		    	Font font = new Font("Arial", Font.PLAIN, 42);
		    	this.letters[i].setFont(font);
		    	this.letters[i].setForeground(Color.black);
		    	this.buchstabenpanel1.add(this.letters[i]);
		};
	    for (int i = 14; i < 26; i++) {
	    		this.letters[i] = new JLabel(abc[i]);
	    		Font font = new Font("Arial", Font.PLAIN, 42);
	    		this.letters[i].setFont(font);
	    		this.letters[i].setForeground(Color.black);
    			this.buchstabenpanel2.add(this.letters[i]);
	    };
		
	}

}
