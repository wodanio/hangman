package de.hangman.windows;

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
	
	public JFrame window;
	private JFrame end;
	private JLabel imageicon;
	
	public GameWindow () {
		System.out.println("inw Main Window");
		this.init();
	}
	
	public void startUp () {
		System.out.println("now Main Window");
		//this.window.setVisible(true);
	}
	
	private void init () {
		
		//Fenster main erstellen
		/*this.window	= new JFrame();
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
  		grafikpanel.setBounds(145, 5, 150, 150);
  		JPanel steuerpanel = new JPanel();
  		steuerpanel.setBounds(115, 220, 250, 35);
  		JPanel buchstabenpanel1 = new JPanel();
  		buchstabenpanel1.setBounds(20, 280, 420, 40);
  		JPanel buchstabenpanel2 = new JPanel();
  		buchstabenpanel2.setBounds(2, 320, 420, 50);
  		JPanel wortpanel = new JPanel();
  		wortpanel.setBounds(10, 160, 425, 50);
  		
  		JTextField field = new JTextField("", 15);
  		
  		JLabel figur = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage("graphic\\hangman9.png")));
		
		JButton button = new JButton("Los!");
		
		grafikpanel.add(figur);
		steuerpanel.add(field);
		steuerpanel.add(button);
		
		//Buchstaben erstellen
		String[] abc = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		JLabel[] letter = new JLabel[26];
	    buchstabenpanel1.setLayout(new BoxLayout(buchstabenpanel1, BoxLayout.X_AXIS));
	    for (int i = 0; i < 14; i++) {
	    		letter[i] = new JLabel(abc[i]);
		    	Font font = new Font("Arial", Font.PLAIN, 42);
				letter[i].setFont(font);
		        buchstabenpanel1.add(letter[i]);
		};
	    for (int i = 14; i < 26; i++) {
	    		letter[i] = new JLabel(abc[i]);
	    		Font font = new Font("Arial", Font.PLAIN, 42);
	    		letter[i].setFont(font);
		        buchstabenpanel2.add(letter[i]);
	    };
	    
	    this.window.add(grafikpanel);
		this.window.add(wortpanel);
		this.window.add(steuerpanel);
		this.window.add(buchstabenpanel1);
		this.window.add(buchstabenpanel2);*/
		
	}

}
