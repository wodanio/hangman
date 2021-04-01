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
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/de/hangman/graphic/hangman9.png"));
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
			
}
	}


