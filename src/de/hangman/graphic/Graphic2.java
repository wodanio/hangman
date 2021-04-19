package de.hangman.graphic;


import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Graphic2 {

	private static ImageIcon showImg() {
		
		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("src/de/hangman/graphic/images/Hangman_1.jpeg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ImageIcon(img);
	}

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		JFrame Fenster = new JFrame ();
		Fenster.setVisible(true);
		Fenster.setSize(500, 500);
		Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Fenster.setTitle("Hangman");
		JPanel panel = new JPanel ();
		JLabel label = new JLabel (showImg());
		panel.add(label);
		Fenster.add(panel);
		
		
		String[] bilder = new String [12];
		bilder [1] = "src/de/hangman/graphic/images/Hangman_1.jpeg";
		bilder [2] = "src/de/hangman/graphic/images/Hangman_2.jpeg";
		bilder [3] = "src/de/hangman/graphic/images/Hangman_3.jpeg";
		bilder [4] = "src/de/hangman/graphic/images/Hangman_4.jpeg";
		bilder [5] = "src/de/hangman/graphic/images/Hangman_5.jpeg";
		bilder [6] = "src/de/hangman/graphic/images/Hangman_6.jpeg";
		bilder [7] = "src/de/hangman/graphic/images/Hangman_7.jpeg";
		bilder [8] = "src/de/hangman/graphic/images/Hangman_8.jpeg";
		bilder [9] = "src/de/hangman/graphic/images/Hangman_9.jpeg";
		bilder [10] = "src/de/hangman/graphic/images/Hangman_10.jpeg";
		bilder [11] = "src/de/hangman/graphic/images/Hangman_11.jpeg";
	
	
		img.setImageIcon(bilder);
		
		boolean eingabe = false;
		if (eingabe = false) {
			bilder = bilder ++;
			
		}
					
}
	}


