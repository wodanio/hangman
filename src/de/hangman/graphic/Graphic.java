package de.hangman.graphic;

import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;

import de.hangman.Hangman;

public class Graphic {
	
	private String path;
	private int imageCouter = 0;
	
	public Graphic () {
		
		// chance paht if the os is windows or not
		if ( Hangman.isWin() )
			this.path = "src\\de\\hangman\\graphic\\imgs\\";
		else
			this.path = "src/de/hangman/graphic/imgs/";
		
	}
	
	public ImageIcon getFirst () throws Exception {
		// return first image
		return this.getImg( 1 );
	}
	
	public ImageIcon getNext () throws Exception {
		
		// count up and get new image
		this.imageCouter++;
		return this.getImg( this.imageCouter + 1 );
		
	}
	
	private ImageIcon getImg( int number ) throws Exception {
		// get image from number with a 200x200 scale
		return new ImageIcon( new ImageIcon( Toolkit.getDefaultToolkit().getImage(this.path+"img"+number+".png") )
				.getImage()
				.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH) );
	}

}
