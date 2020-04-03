package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private ControllerMain controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PApplet.main("View.Main");

	}
	
	public void settings () {
		size (800, 800);
		
	}
	
	public void setup () {
		controller = new ControllerMain (this);
		
	}
	
	public void draw () {
		background (0);
		
		for (int i = 0; i < controller.netflix().size(); i++) {
			controller.netflix().get(i).drawAll((i*150)+ 80, this);
		}
		text("Filtrar", 100, 80);
		text("Por año oprima la letra y", 100, 100);
		text("Por nombre oprima la letra n", 100, 130);
		text("Por rating oprima la letra r", 100, 160);
		text("Por tipo oprima la letra t", 100, 190);
	}
	
	public void keyPressed () {
		controller.sortListController(key);
		
	}

}
