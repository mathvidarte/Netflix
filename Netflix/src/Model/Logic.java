package Model;

import java.util.Collections;
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
			name = textSplit[0];
			year = textSplit [1];
			rating = Integer.parseInt (textSplit[2]);
			type = textSplit [3];
			
			netflix.add(new Netflix (name, year, type, rating, app));
		}
		
	}
	
	public LinkedList <Netflix> getNetflix () {
		return netflix;
	}
	
	public void setNetflix (LinkedList<Netflix> netflix) {
		this.netflix = netflix;
	}
	
	public void sortList(char r) {
		switch (r) {
		case 'r':
			Collections.sort(netflix);
			break;
		}
	}
	
	

}
