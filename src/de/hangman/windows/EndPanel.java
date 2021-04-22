package de.hangman.windows;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import de.hangman.Hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EndPanel extends JPanel {
	
	private JLabel text01, text02, text03;

	public EndPanel() {
		setLayout(null);
		
		this.text01 = new JLabel();
		this.text01.setFont(new Font("Arial", Font.PLAIN, 16));
		this.text01.setHorizontalAlignment(SwingConstants.CENTER);
		this.text01.setBounds(10, 100, 680, 30);
		add(this.text01);
		
		this.text02 = new JLabel();
		this.text02.setHorizontalAlignment(SwingConstants.CENTER);
		this.text02.setFont(new Font("Arial", Font.PLAIN, 24));
		this.text02.setBounds(10, 140, 680, 30);
		add(this.text02);
		
		JButton reload = new JButton("Nochmal");
		reload.setBounds(220, 200, 120, 30);
		add(reload);
		
		JButton exit = new JButton("Beenden");
		exit.setBounds(360, 200, 120, 30);
		add(exit);
		
		this.text03 = new JLabel();
		this.text03.setHorizontalAlignment(SwingConstants.CENTER);
		this.text03.setFont(new Font("Arial", Font.PLAIN, 16));
		this.text03.setBounds(10, 260, 680, 30);
		add(this.text03);
		
		reload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				Hangman.reloadGame();
				
			}
		});
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});

	}
	
	public EndPanel doWin () {
		
		this.text01.setText("Super gemacht!");
		this.text02.setText("Du hast gewonnen!");
		this.text02.setForeground(Color.GREEN);
		
		return this;
	}
	
	public EndPanel doEnd ( String word ) {
		
		this.text01.setText("Dumm gelaufen!");
		this.text02.setText("Leider hast du verloren!");
		this.text02.setForeground(Color.RED);
		
		this.text03.setText("Das Wort war: "+word);
		
		return this;
	}
	
}
