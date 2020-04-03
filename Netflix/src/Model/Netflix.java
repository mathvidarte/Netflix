package Model;

import processing.core.PApplet;

public class Netflix implements Comparable<Netflix> {
	private String name, year, type;
	private int rating;
	private int posX;
	private int posY;
	private PApplet app;
	
	public Netflix (String name, String year, String type, int rating, PApplet app) {
		this.name = name;
		this.year = year;
		this.type = type;
		this.rating = rating;
		this.posY = 500;
		this.app = app;
	}
	
	public void drawAll (int posX, PApplet app) {
		app.fill (255);
		app.text(this.name, posX, posY + 20);
		app.text(this.year, posX, posY + 40);
		app.text(this.type, posX, posY + 60);
		app.text(this.rating, posX, posY + 80);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
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
