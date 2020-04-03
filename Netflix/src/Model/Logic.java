package Model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String [] text;
	private String [] textSplit;
	private LinkedList <Netflix> netflix;
	private String name;
	private String year;
	private String type;
	private int rating;
	
	public Logic (PApplet app) {
		this.app = app;
		
		text = app.loadStrings ("../data/netflix.txt");
		netflix = new LinkedList <Netflix>();
		createNetflix();
	}
	
	public void createNetflix () {
		for (int i = 0; i < text.length; i++) {
			textSplit = text[i].split(",");
		}
		
	}

}
