package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run() throws Exception 
	{
		Scanner lector = new Scanner(System.in);
		String rta = "";
		view.printMenu();

		int option = lector.nextInt();
		if(option==1)
		{
			modelo.loadJSON();
		}
	}	
}
