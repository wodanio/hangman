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

	public static void main(String[] args) {
		
		//Fenster main erstellen
		JFrame main = new JFrame();
		
		//Grundlegende Eigenschaften vom main-Fenster festlegen
		main.setResizable(true);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ab Hier: Content ins Fenster
	    Container cp = main.getContentPane();
	    cp.setLayout(null);
		
	    //Panel für Grafik
		JPanel grafikpanel = new JPanel();
		grafikpanel.setBounds(145, 5, 150, 150);
		//Panel für Textfeld und Button
		JPanel steuerpanel = new JPanel();
		steuerpanel.setBounds(115, 220, 250, 35);
		//Panel für Buchstaben 1
		JPanel buchstabenpanel1 = new JPanel();
		buchstabenpanel1.setBounds(20, 280, 420, 40);
		//Panel für Buchstaben 2
		JPanel buchstabenpanel2 = new JPanel();
		buchstabenpanel2.setBounds(2, 320, 420, 50);
		//Panel für Leere Felder/Das Wort
		JPanel wortpanel = new JPanel();
		wortpanel.setBounds(10, 160, 425, 50);
		
		JTextField field = new JTextField("TestText", 15);
		
		//Tobi (grafic)0
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
		
		//Länge vom Wort = Striche für Wort
		int länge = Wort.length;
		JLabel[] goal = new JLabel[länge];
		for(int i = 0; i < länge; i++) {
			goal[i] = new JLabel("_");
			Font font = new Font("Arial", Font.PLAIN, 42);
			goal[i].setFont(font);
			wortpanel.add(goal[i]);
		}
		
		main.add(grafikpanel);
		main.add(wortpanel);
		main.add(steuerpanel);
		main.add(buchstabenpanel1);
		main.add(buchstabenpanel2);
		
		main.setSize(440, 460);
		main.setLocationRelativeTo(null);
		main.setVisible(true);		
		
		//ActionListener Los-Button Jona (Events)
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
						
				String Eingabe = field.getText().toUpperCase();
						
				//Buchstaben rot färben
				for(int i=0; i < 26; i++) {
						
					if(Eingabe.equalsIgnoreCase(letter[i].getText())){
						
						if(Arrays.asList(Wort).contains(Eingabe)) {
							letter[i].setForeground(Color.GREEN);
						}else {
							letter[i].setForeground(Color.RED);
						};
								
					};
				};
			};
		});
				
	}

}
