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

	/**
	 * Interaccion del usuario con el programa.
	 */
	public void run()
	{
		Scanner lector = new Scanner(System.in);
		String rta = "";
		view.printMenu();

		int option = lector.nextInt();

		while(option != 7)
		{
			if(option==1)
			{
				modelo.example();
				if(modelo.darTamano()!=1)
					view.printMessage("La lista tiene " + modelo.darTamano() + " comparendos.");
				else
					view.printMessage("La lista tiene " + modelo.darTamano() + " comparendo.");
				view.printMessage("");
				view.printMenu();
			}
			else if(option==2)
			{
				if(modelo.darTamano()!=1)
					view.printMessage("La lista tiene: " + modelo.darTamano() + " comparendos.");
				else
					view.printMessage("La lista tiene " + modelo.darTamano() + " comparendo.");
			}
			else if(option==3)
			{
				view.printMessage("Ingrese la posicion del elemento comparendo deseado.");
				int position = lector.nextInt();

				if( modelo.buscarPosicion(position)!= null)
					view.printMessage("El comparendo encontrado fue: "+ modelo.buscarPosicion(position).toString());
				else
					view.printMessage("No se encontro el comparendo.");

				view.printMessage("");
				view.printMenu();
			}
			else if(option==4)
			{
				System.out.println("Ingrese la posicion del comparendo a eliminar.");
				int position = lector.nextInt();

				if( modelo.buscarPosicion(position)!= null)
					view.printMessage(modelo.eliminar(position).toString());
				else
					view.printMessage("No se pudo eliminar el comparendo.");

				view.printMessage("La lista tiene " + modelo.darTamano() + " comparendos.");
				view.printMessage("");
				view.printMenu();
			}
			else if(option==5)
			{
				view.printModelo(modelo);
				view.printMenu();
			}
			else if(option==6)
			{
				modelo.loadJSON();
				if(modelo.darTamano()!=1)
					view.printMessage("La lista tiene " + modelo.darTamano() + " comparendos.");
				else
					view.printMessage("La lista tiene " + modelo.darTamano() + " comparendo.");
				view.printMessage("");
				view.printMenu();
			}
			else
			{
				view.printMessage("Numero invalido");
				view.printMessage("");
				view.printMenu();
			}
			option = lector.nextInt();
		}
		if(option==7)
		{
			System.out.println("Ha salido con exito.");
		}
	}	
}
