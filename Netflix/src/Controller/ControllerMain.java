package Controller;

import java.util.LinkedList;

import Model.Logic;
import Model.Netflix;
import processing.core.PApplet;

public class ControllerMain {
	
	private Logic logic;
	
	public ControllerMain (PApplet app) {
		logic = new Logic (app);
		
	}
	
	public LinkedList <Netflix> netflix () {
		return logic.getNetflix();
	}
	
	public void sortListController (char r) {
		logic.sortList(r);
	}
	

}
