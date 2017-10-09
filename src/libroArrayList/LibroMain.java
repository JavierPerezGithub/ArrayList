package libroArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroMain
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		menu();		
	}
	public static void menu()
	{
		ArrayList<Libro> libros = new ArrayList<Libro>();
		libros.add(new Libro("Harry Potter", "JKRowling", 5, 2));
		libros.add(new Libro("Batman", "Todd", 9, 9));
		libros.add(new Libro("Java", "Pildoras", 3, 0));
		
		System.out.println("*************** Bienvenido a la libreria *********************");
		System.out.println();
		int op=-1;
		while(op!=0)
		{		
			System.out.println(" 1) añadir libro: ");
			System.out.println(" 2) buscar libro: ");
			System.out.println(" 3) eliminar libro: ");
			System.out.println(" 4) modificar libro: ");
			System.out.println(" 5) prestar libro: ");
			System.out.println(" 6) devolver libro: ");
			System.out.println(" 7) mostrar libreria: ");			
			System.out.println(" 0) Salir");
			
			op=Integer.parseInt(sc.nextLine());
			
			switch (op)
			{
			case 1:
				anadoLibro(libros);
				break;
			case 2:
				
				if(buscaLibro(libros))
				{
					System.out.println("Libro encontrado");
				}
				else
					System.out.println("Libro no encontrado");
				break;
			case 3:
				
				if(eliminarLibro(libros))
				{
					System.out.println("Libro borrado con éxito");
				}
				else
					System.out.println("Se ha producido un error en el proceso de borrado");
				break;
			case 4:
				if(modificarLibro(libros))
					System.out.println("Libro modificado con éxito");
				else
					System.out.println("Error al modificar");
					
				break;
			case 5:
				if(prestaLibro(libros))
					System.out.println("Libro prestado con éxito");
				else
					System.out.println("Libro no disponible");
				break;
			case 6:
				if(devuelveLibro(libros))
					System.out.println("Libro devuelto con éxito");
				else
					System.out.println("Se ha producido un error");
				break;
			case 7:
				for (Libro l : libros)
				{
					l.mostrarLibro();
				}
				break;
			case 0:
				System.out.println("Adios");
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}			
		}
	}
	private static boolean devuelveLibro(ArrayList<Libro> libros)
	{
		System.out.println("Ha elegido devolver un libro: ");
		System.out.println("Introduzca el libro a devolver: ");
		String q=sc.nextLine();
		for (Libro li : libros)
		{
			if(li.getTitulo().equalsIgnoreCase(q))
				if(li.devolucion())
				return true;
				else
					return false;
		}
		return false;
	}
	private static boolean prestaLibro(ArrayList<Libro> libros)
	{
		System.out.println("Ha elegido prestar un libro: ");
		System.out.println("Introduzca el libro a prestar: ");
		String q=sc.nextLine();
		for (Libro li : libros)
		{
			if(li.getTitulo().equalsIgnoreCase(q))
				if(li.prestamo())
				return true;
				else
					return false;
		}
		return false;
	}
	private static boolean modificarLibro(ArrayList<Libro> libros)
	{
		System.out.println("Ha elegido modificar un libro: ");
		System.out.println("Introduzca el libro a modificar: ");
		String q=sc.nextLine();
		int c=0;
		for (Libro li : libros)
		{			
			if(li.getTitulo().equalsIgnoreCase(q))
			{				
				Libro l= new Libro();
				System.out.println("Introduzca el nuevo nombre del libro: ");
				l.setTitulo(sc.nextLine());
				System.out.println("Introduzca el nuevo nombre del autor: ");
				l.setAutor(sc.nextLine());
				System.out.println("Introduzca el nuevo número de ejemplares: ");
				l.setEjemplares(Integer.parseInt(sc.nextLine()));
				System.out.println("Introduzca el nuevo número de ejemplares prestados: ");
				l.setPrestados(Integer.parseInt(sc.nextLine()));
				int a =libros.indexOf(q);//te descubre la posición del array
				libros.set(c,l);	
				c++;
				return true;
			}			
		}
		return false;		
	}
	private static boolean eliminarLibro(ArrayList<Libro> libros)
	{
		System.out.println("Ha elegido eliminar un libro: ");
		System.out.println("Introduzca el libro a borrar: ");
		String l=sc.nextLine();
		
		for (Libro li : libros)
		{
			if(li.getTitulo().equalsIgnoreCase(l))
			{
				libros.remove(li);
				return true;
			}
			else
				return false;	
		}
		return false;
		
		
	}
	private static boolean buscaLibro(ArrayList<Libro> libros)
	{
		System.out.println("Ha elegido buscar un libro: ");
		System.out.println("Introduzca el libro a buscar: ");
		String l=sc.nextLine();
		for (Libro li : libros)
		{
			if(li.getTitulo().equalsIgnoreCase(l))
			{
				return true;
			}
			else
				return false;	
		}
		return false;		
	}
	private static void anadoLibro(ArrayList<Libro> libros)
	{
		Libro l= new Libro();
		System.out.println("Ha elegido añadir libro: ");
		System.out.println("Introduzca nombre del libro que desea añadir: ");
		l.setTitulo(sc.nextLine());
		System.out.println("Introduzca nombre del autor que desea añadir: ");
		l.setAutor(sc.nextLine());
		System.out.println("Introduzca el número de ejemplares que desea añadir: ");
		l.setEjemplares(Integer.parseInt(sc.nextLine()));
		System.out.println("Introduzca el número de ejemplares prestados: ");
		l.setPrestados(Integer.parseInt(sc.nextLine()));
		libros.add(l);		
	}
}
