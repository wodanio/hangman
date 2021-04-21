package de.hangman.windows;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class MainWindow {
	
	
	public JFrame main;
	private JFrame ende;
	private JLabel figur;
	
	
	public MainWindow () {
		
	}
	
	public void startUp () {
		this.init();
	}

	private void init () {
		
		//Fenster main erstellen
		this.main = new JFrame();
		this.ende = new JFrame();
		
		//Grundlegende Eigenschaften vom main-Fenster festlegen
		this.main.setResizable(false);
		this.main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ab Hier: Content ins Fenster
	    Container cp = this.main.getContentPane();
	    cp.setLayout(null);
		
	    //Panel f�r Grafik
		JPanel grafikpanel = new JPanel();
		grafikpanel.setBounds(145, 5, 150, 150);
		//Panel f�r Textfeld und Button
		JPanel steuerpanel = new JPanel();
		steuerpanel.setBounds(115, 220, 250, 35);
		//Panel f�r Buchstaben 1
		JPanel buchstabenpanel1 = new JPanel();
		buchstabenpanel1.setBounds(20, 280, 420, 40);
		//Panel f�r Buchstaben 2
		JPanel buchstabenpanel2 = new JPanel();
		buchstabenpanel2.setBounds(2, 320, 420, 50);
		//Panel f�r Leere Felder/Das Wort
		JPanel wortpanel = new JPanel();
		wortpanel.setBounds(10, 160, 425, 50);

		JTextField field = new JTextField("", 15);
		
		
		//Content erstellen (ende)
		JPanel endepanel = new JPanel();
				
		JLabel endetext = new JLabel("");
		JButton endebutton = new JButton("Ja!");
				
		endepanel.add(endetext);
		endepanel.add(endebutton);
				
		this.ende.add(endepanel);
		this.ende.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.ende.setVisible(false);
		
		
		//Tobi (grafic)
		JLabel figur = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kai\\Desktop\\figur.png")));
		
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
	    
	    //Gesuchtes Wort (Tobi Wordmanagement)
		String[] Wort = {"T", "E", "S", "T"};
		
		//L�nge vom Wort = Striche f�r Wort
		int lange = Wort.length;
		JLabel[] goal = new JLabel[lange];
		for(int i = 0; i < lange; i++) {
			goal[i] = new JLabel("_");
			Font font = new Font("Arial", Font.PLAIN, 42);
			goal[i].setFont(font);
			wortpanel.add(goal[i]);
		}
		
		this.main.add(grafikpanel);
		this.main.add(wortpanel);
		this.main.add(steuerpanel);
		this.main.add(buchstabenpanel1);
		this.main.add(buchstabenpanel2);
		
		this.main.setSize(440, 460);
		this.main.setLocationRelativeTo(null);
		this.main.setVisible(true);		
		
		//ActionListener Los-Button, Jona (Events)
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
						
				String Eingabe = field.getText();
				field.setText("");
				
				//Buchstaben rot f�rben
				for(int i=0; i < 26; i++) {
						
					if(Eingabe.equalsIgnoreCase(letter[i].getText())){
						
						if(Arrays.asList(Wort).contains(Eingabe.toUpperCase())) {
							letter[i].setForeground(Color.GREEN);
						}else {
							letter[i].setForeground(Color.RED);
						};
								
					};
				};
			};
			
		});
		
		//Wenn spiel vorbei (Events Jona)
		boolean spielende = true;
		boolean gewonnen = true;
		
		if(spielende == true) {
			
			if(gewonnen == true) {
				endetext.setText("Du hast das Spiel gewonnen! M�chtest du das Programm neustarten?");
				this.ende.pack();
				this.ende.setLocationRelativeTo(null);
				this.ende.setVisible(true);
			}else {
				endetext.setText("Du hast leider verloren! M�chtest du das Programm neustarten?");
				this.ende.pack();
				this.ende.setLocationRelativeTo(null);
				this.ende.setVisible(true);
			};
		};
		
		//ActionListener Neustart-Button am Ende, Jona (Events)
		endebutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			
				boolean neustart = true;
				
			};
					
		});
	
	}
	
}
