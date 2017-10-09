package Strings;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploStrings
{


	public static void main(String[] args)
	{
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		ArrayList<String> c = new ArrayList<String>();
		c.add("Pepe");
		nombres.add("Pepe");
		nombres.add("Ana");
		nombres.add("Maria");
		nombres.add("Rosa");
		nombres.add("Pepe");
		nombres.add(2,"Javier");//introduce mi nombre en la posicion 2 del array
		
		System.out.println(nombres);
		
		//comprueba si está
		System.out.println(nombres.contains("Pepe"));
		System.out.println(nombres.contains("Paco"));
		// indexOf, lastIndexOf control y si lo encuentra da la posición y si no da -1
		
		System.out.println(nombres.indexOf("Pepe"));
		System.out.println(nombres.lastIndexOf("Pepe"));
		
		//remove borra el elemento.
		nombres.remove("Pepe");
		nombres.remove(0);
		
		/*removeAll funciona creando otro arraylist y anadiendo el parámetro repetido a borrar
		 * ArrayList<String> c = new ArrayList<String>();
		 * c.add("Pepe");*/
		nombres.removeAll(c);
		
		/*isEmpty comprueba si el array está vacio*/
		System.out.println(nombres.isEmpty());
		/*Clear borra todo el array*/		
		nombres.clear();
		System.out.println(nombres.isEmpty());
		/**
		 * solo puede haber un next dentro de un bucle.
		 * next es leer mas saltar.
		 */		
		/*Iterator<String> it = nombres.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s+" "+s.length());
		}*/
		/**
		 * Bucle for each con tipo de dato un nombre que le queramos dar (o): el array a consultar
		 * sysout y mostramos el contenido de (o)
		 */
		for (String o : nombres)
		{
			System.out.println(o);
		}
	}
}
