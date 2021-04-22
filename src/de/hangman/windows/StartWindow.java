package de.hangman.windows;

import java.awt.event.*;
import javax.swing.*;

import de.hangman.Hangman;

public class StartWindow {
	
	private JFrame window;
	
	public StartWindow() {
		
		this.window = new JFrame("Galgenmännchen");
		
		this.init();
		
	}
	
	public void show () {
		this.window.setVisible(true);
	}
	
	public void exit () {
		this.window.setVisible(false);
	}

	private void init() {
		
		//Fenster window erstellen
		JFrame fehler = new JFrame("Fehler");
			
		//Eigenschaften window
		this.window.setResizable(false);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fehler.setResizable(false);
		
		
		//Content erstellen (window)
		JPanel panel = new JPanel();
		
		JLabel text1 = new JLabel("Herzlich Willkommen zu Galgenmännchen!");
		JLabel text2 = new JLabel("Möchtest du selbst ein Wort fetslegen oder ein zufälliges Wort auswählen lassen?");
		JButton button = new JButton("Los Gehts!");
		String menuliste[] = {"Automatisch", "Manuell"};
		JComboBox menu = new JComboBox(menuliste);
		JTextField field = new JTextField("", 15);
		field.setEnabled(false);
		
		panel.add(text1);
		panel.add(text2);
		panel.add(menu);
		panel.add(field);
		panel.add(button);
		
		this.window.add(panel);
		this.window.setSize(550, 125);
		this.window.setLocationRelativeTo(null);
		this.window.setVisible(true);
		
		//Content erstellen (fehler)
		JPanel fehlerpanel = new JPanel();
		
		JLabel fehlertext = new JLabel("Bitte ein Wort eingeben!");
		JButton fehlerbutton = new JButton("Ok!");
		
		fehlerpanel.add(fehlertext);
		fehlerpanel.add(fehlerbutton);
		
		fehler.add(fehlerpanel);
		fehler.pack();
		fehler.setLocationRelativeTo(null);
		fehler.setVisible(false);
		
		//ActionListener Los-Button
	
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(menu.getSelectedItem().toString().equals("Automatisch")){
						Hangman.startGame( "auto", "" );
					}else {
						if(field.getText().equals("")) {
							fehler.setVisible(true);
						}else {
							Hangman.startGame( "manual", field.getText() );
						}
					}
				} catch ( Exception e1 ) {
					System.err.println( e1 );
				}
				
			}
		});
		
		//Menu ItemListener
		menu.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				
				if(menu.getSelectedItem().toString() == "Manuell") {
					field.setEnabled(true);
				}else {
					field.setEnabled(false);
					field.setText("");
				}
				
			}
			
		});
		
		//Fehler-Fenster Ok Button Action Listener
		fehlerbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				fehler.dispose();
				
			}
		});

	}
	
}