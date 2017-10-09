package libroArrayList;
public class Libro
{
	String titulo;
	String autor;
	int ejemplares;
	int prestados;

	public Libro(String titulo, String autor, int ejemplares, int prestados)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}
	public Libro()
	{
	}
	public int getPrestados()
	{
		return prestados;
	}
	public void setPrestados(int prestados)
	{
		this.prestados = prestados;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getAutor()
	{
		return autor;
	}
	public void setAutor(String autor)
	{
		this.autor = autor;
	}
	public int getEjemplares()
	{
		return ejemplares;
	}
	public void setEjemplares(int ejemplares)
	{
		this.ejemplares = ejemplares;
	}	
	public boolean prestamo()
	{
		if(this.prestados<this.ejemplares)
		{
			this.prestados ++;
			return true;			
		}
		else		
		return false;		
	}
	public boolean devolucion()
	{
		if(this.prestados!=0)
		{
		this.prestados --;
		return true;
		}
		else			
		return false;		
	}
	public void mostrarLibro()
	{
		System.out.println("Titulo: "
		+this.titulo+" autor: "+this.autor+" "+this.ejemplares
		+" ejemplares "+this.prestados+" prestados");
	}
}