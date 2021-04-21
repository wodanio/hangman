package de.hangman.xyz;

public class XYZ {
	
	private String way;

	public XYZ( String way ) {
		this.way = way;
	}
	
	public void doAnything( String str ) {
		
		this.way += str;
		
	}
	
	public String getWay () {
		return this.way;
	}

}
