package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Netflix implements Comparable<Netflix> {
	private String name, type;
	private int rating;
private int year;
	private int posX;
	private int posY;
	private PApplet app;
	
	private PImage breakingbad;
	private PImage dark;
	private PImage mindhunter;
	private PImage ozark;
	private PImage starTrek;
	private PImage theIrishmen;
	
	public Netflix (String name, int year, String type, int rating, PApplet app) {
		this.name = name;
		this.year = year;
		this.type = type;
		this.rating = rating;
		this.posY = 500;
		this.app = app;
		
		breakingbad = app.loadImage ("imagen/breakingbad.jpg");
		dark = app.loadImage ("imagen/dark.jpg");
		mindhunter = app.loadImage ("imagen/mindhunter.jpg");
		ozark = app.loadImage ("imagen/ozark.jpg");
		starTrek = app.loadImage ("imagen/startrek.jpg");
		theIrishmen = app.loadImage ("imagen/theirishman.jpg");
	}
	
	public void drawAll (int posX, PApplet app) {
		app.fill (255);
		app.text(this.name, posX, posY + 20);
		app.image(breakingbad, 50, 200, 100, 100);
		app.text(this.year, posX, posY + 40);
		app.image(dark, 100, 200, 100, 100);
		app.text(this.type, posX, posY + 60);
		app.text(this.rating + "%", posX, posY + 80);
		
		app.image(mindhunter, 150, 200, 100, 100);
		app.image(ozark, 220, 200, 100, 100);
		app.image(starTrek, 270, 200, 100, 100);
		app.image(theIrishmen, 350, 200, 100, 100);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}


	public int compareTo(Netflix nextNetflix) {
		return this.rating - nextNetflix.getRating();
	}
	
	

}
