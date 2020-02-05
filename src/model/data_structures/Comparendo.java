package model.data_structures;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;

public class Comparendo 
{
	
	@SerializedName("OBJECTID")
	private int objID;
	
	@SerializedName("FECHA_HORA")
	private String fecha;
	
	@SerializedName("MEDIO_DETE")
	private String medioDet;
	
	@SerializedName("CLASE_VEHI")
	private String vehiculo;
	
	@SerializedName("TIPO_SERVI")
	private String tipoServicio;
	
	@SerializedName("INFRACCION")
	private String infraccion;
	
	@SerializedName("DES_INFRAC")
	private String descripcion;
	
	@SerializedName("LOCALIDAD")
	private String localidad;
	
	private double coords1;
	
	private double coords2;
	
	
	public Comparendo (int id, String fecha, String medio, String vehiculo, String tipoServ, String infraccion, String descripcion, String localidad, double cord1, double cord2)
	{
		objID = id;
		this.fecha = fecha;
		medioDet= medio;
		this.vehiculo = vehiculo;
		tipoServicio = tipoServ;
		this.infraccion = infraccion;
		this.localidad = localidad;
		coords1 = cord1;
		coords2 = cord2;
	}
	
	@Override
	public String toString()
	{
		return (objID + vehiculo + infraccion + coords1 + coords2);
	}

}
