package de.hangman.windows;

import java.awt.event.*;
import javax.swing.*;

public class StartWindow {

public static void main(String[] args) {
		
		//Fenster window erstellen
		JFrame window = new JFrame("Galgenmännchen");
		JFrame fehler = new JFrame("Fehler");
			
		//Eigenschaften window
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		window.add(panel);
		window.setSize(550, 125);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
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
		boolean start = false;
	
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				if(menu.getSelectedItem().toString().equals("Automatisch")){
					String modus = "Automatisch";
					boolean start = true;
				}else {
					
					if(field.getText().equals("")) {
						fehler.setVisible(true);
					}else {
						String modus = "Manuell";
						String eingabe = field.getText();
						boolean start = true;
					}
				}
			}
		});
		
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
		
		//Funktion zum schließen
		

	}

}