package de.hangman.event;

import javax.swing.JFrame;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("test");
		frame.setSize(400,400);
		frame.setVisible(true);
		event e=new event(frame);
	while(true) {
		System.out.println(e.Strings.toString());
	}
	}

}
