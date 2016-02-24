public class Jarra
{
	// The state variables
	//loubna

	private int capacidad;
	private int contenido;

	// Constructors

	public Jarra(int x)
	{
		capacidad = x;
		contenido =0;
	}

	// The methods

	public int capacidad()
	{
		return capacidad;
	}
	public int cantidad()
	{
		return contenido;
	}
	public void llena()
	{
		contenido=capacidad;
	}
	public void vacia()
	{
		contenido=0;
	}
	public void llenaDesde( Jarra j)
	{
		if ((j.contenido + this.contenido)<=this.capacidad)
		{
			this.contenido=this.contenido+j.contenido;
			j.contenido=0;
		}
		else
		{
			this.contenido=this.capacidad;
			j.contenido=j.contenido+this.contenido-this.capacidad;
		}
	}
	public String toString()
	{
		return "la capacidad es "+this.capacidad+" el contenido es "+this.contenido;
	}
}
