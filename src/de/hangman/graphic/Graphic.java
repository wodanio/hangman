package de.hangman.graphic;

import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;

import de.hangman.Hangman;

public class Graphic {
	
	private String path;
	private int imageCouter = 0;
	
	public Graphic () {
		
		if ( Hangman.isWin() )
			this.path = "src\\de\\hangman\\graphic\\images\\";
		else
			this.path = "src/de/hangman/graphic/images/";
		
	}
	
	public ImageIcon getFirst () throws Exception {
		return this.getImg( 1 );
	}
	
	public ImageIcon getNext () throws Exception {
		
		this.imageCouter++;
		return this.getImg( this.imageCouter + 1 );
		
	}
	
	private ImageIcon getImg( int number ) throws Exception {
		return new ImageIcon( new ImageIcon( Toolkit.getDefaultToolkit().getImage(this.path+"Hangman_"+number+".jpeg") )
				.getImage()
				.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH) );
	}

}
