package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }

	    /**
	     * Menu de la consola
	     */
		public void printMenu()
		{
			System.out.println("1. Objeto de ejemplo");
			System.out.println("2. Dar numero de elementos");
			System.out.println("3. Buscar objeto");
			System.out.println("4. Eliminar objeto");
			System.out.println("5. Imprimir lista");
			System.out.println("6. Leer archivo");
			System.out.println("7. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

	    /**
	     * Imprimir mensaje
	     * @param String mensaje. Mensaje a imprimir
	     */

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
			System.out.println(modelo.imprimirLista());
			System.out.println("");
		}
}
