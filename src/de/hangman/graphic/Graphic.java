package de.hangman.graphic;

import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Graphic {
	
	private int imageCouter = 0;
	
	public Graphic () {
		
	}
	
	public ImageIcon getFirst () throws Exception {
		return this.getImg( 1 );
	}
	
	public ImageIcon getNext () throws Exception {
		
		this.imageCouter++;
		return this.getImg( this.imageCouter + 1 );
		
	}
	
	private ImageIcon getImg( int number ) throws Exception {
		return new ImageIcon( new ImageIcon( Toolkit.getDefaultToolkit().getImage("src/de/hangman/graphic/images/Hangman_"+number+".jpeg") )
				.getImage()
				.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH) );
	}

}
