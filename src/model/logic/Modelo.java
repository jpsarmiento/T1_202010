package model.logic;

import model.data_structures.Comparendo;
import model.data_structures.LinkedList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import com.google.gson.*;
import model.data_structures.Node;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo<Item extends Comparable <Item>> {
	/**
	 * Atributos del modelo del mundo
	 */
	private LinkedList datos;
	
	/**
	 * Constructor del modelo del mundo
	 */
	public Modelo()
	{
		datos = new LinkedList();
	}
	
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.getLength();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregarComienzo(Item x)
	{	
		datos.addAtBeginning(x);
	}
	
	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregarFinal(Item x)
	{	
		datos.addAtEnd(x);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 * @throws Exception 
	 */
	
	public Node buscarPosicion(int x) throws Exception
	{
		return datos.getAt(x);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar_
	 * @return dato eliminado
	 * @throws Exception 
	 */
	public void eliminar(int pos) throws Exception
	{
		datos.delete(pos);
	}
	
	public void loadJSON() throws Exception
	{
		Gson gson = new Gson();
		BufferedReader br = new BufferedReader ( new FileReader ( new File ("./data/comparendos_dei_2018.geojson")));
		String content = "";
		String line = br.readLine();
		
		while(line != null)
		{
			content += line;
			line = br.readLine();
		}
		
		Collection<Comparendo> x = (Collection<Comparendo>) gson.fromJson(content, Comparendo.class);
		
		Iterator iter = x.iterator();
		while(iter.hasNext())
		{
			Comparendo a = (Comparendo) iter.next();
			System.out.println(a);
			datos.addAtEnd((Comparable) a);
		}
	}


}
