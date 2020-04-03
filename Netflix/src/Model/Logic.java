package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String [] text;
	private String [] textSplit;
	private LinkedList <Netflix> netflix;
	private String name;
	private int year;
	private String type;
	private int rating;
	
	private Name nameNet;
	private Year yearNet;
	private Type typeNet;
	
	
	
	
	
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
			year = Integer.parseInt (textSplit [1]);
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
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		case 'n':
			Collections.sort(netflix, nameNet);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		case 't':
			Collections.sort(netflix, typeNet);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		case 'y' :
			Collections.sort(netflix, yearNet);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		}
	}
	
	public void printReport () throws FileNotFoundException {
		PrintWriter pw = new PrintWriter (new File("data/newText.txt"));
		pw.print(peli());
		pw.close();
	}
	
	public String peli() {
		String movie = "";
		for ( int i = 0; i < netflix.size(); i++) {
			Netflix n = netflix.get(i);
			String msg = n.getName() + " " + n.getRating() + " " + n.getType() + " " + n.getYear();
			movie += msg + "/n";
		}
		return movie;
	
	
	}

}
