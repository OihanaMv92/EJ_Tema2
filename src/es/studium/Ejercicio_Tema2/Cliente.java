package es.studium.Ejercicio_Tema2;

/**
 * Aqui estaran los datos de nuestros clientes.
 * @author Oihana
 *
 */
public class Cliente
{
	/* Creamos los Atributos */
	private String dni;
	private String nombre;
	private String direccion;


	public Cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";
	}
	/**
	 * Constructor por parametros.
	 * @param i
	 * @param n
	 * @param d
	 */

	/* Creamos los Constructores pon parámetros */
	public Cliente(String i, String n, String d)
	{
		dni = i;
		nombre = n;
		direccion = d;
	}
	
	//Creamos Getter and Setter
	
	/**
	 * @return the dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}


	
}