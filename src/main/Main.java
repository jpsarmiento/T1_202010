package main;
import controller.Controller;

public class Main {
	
	public static void main(String[] args) 
	{
		Controller controler = new Controller();
		try {
			controler.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
