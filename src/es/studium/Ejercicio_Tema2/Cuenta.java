package es.studium.Ejercicio_Tema2;

/**
 * Aqui ponemos los datos de las cuentas.
 * @author Oihana
 *
 */
public class Cuenta
{
	/* Creamos los Atributos */
	private int numero;
	private int saldo;
	private Cliente cliente; // Aquí hemos creado un nuevo atributo "cliente" de tipo Cliente

	/* Creamos los Constructores por defecto */
	public Cuenta()
	{
		numero = 0;
		saldo = 0;
		cliente = new Cliente();
	}
	/**
	 * Conatructor por parametros
	 * @param nc
	 * @param s
	 * @param c
	 */

	/* Creamos los Constructores pon parámetros */
	public Cuenta(int nc, int s, Cliente c)
	{
		numero = nc;
		saldo = s;
		cliente = c;
	}

	/**
	 * @return the numero
	 */
	public int getNumero()
	{
		return numero;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo()
	{
		return saldo;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente()
	{
		return cliente;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}
