package test.data_structures;

import org.junit.Before;
import org.junit.Test;

import model.data_structures.Comparendo;
import model.data_structures.LinkedList;
import model.logic.Modelo;

public class TestLinkedList <Item>
{
	
	
	private LinkedList list;
	
	@Before
	public void setUp1() 
	{
		Comparendo a = new Comparendo(1, "4/02/2020", "Lapiz", "Particular", "Servicio", "Velocidad", "Iba muy rapido", "Kennedy", 7, 5 );
		Comparendo b = new Comparendo(2, "5/02/2020", "Lapiz", "Publico", "Servicio", "Semaforo", "Semaforo en rojo", "Bosa", -14, 18 );
		Comparendo c = new Comparendo(3, "5/02/2020", "Lapiz", "Publico", "Servicio", "Alcohol", "Conductor ebrio", "Fontibon", -2, 3 );
		Comparendo d = new Comparendo(4, "7/02/2020", "Coso", "Particular", "Servicio", "Tombo", "Me dijo tombo", "Usaquen", 33, 0 );
	}

	@Test
	public void testAddAtBeggining() 
	{
		setUp1();
		
	}
	
	@Test
	public void testAddAtEnd()
	{
		
	}
	
	@Test
	public void testDelete() 
	{
		
	}
	
	@Test
	public void testGetAt() 
	{
		
	}
	
	@Test
	public void testGetLength() 
	{
		
	}
}
