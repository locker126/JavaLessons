/**
 * 
 */
package Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import javaUtils.*;
/**
 * @author JAVA
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] palabras = {"Pez", "Arbol", "Zona", "Becerro", "Real Madrid"};
			Arrays.sort(palabras);
			for (String p : palabras){
				System.out.println(p);
			}
			
			
			ListaEjemplo lista = new ListaEjemplo();
			for (String d : lista._Personas){
				System.out.println(d);
			}
			System.out.println(lista._HashExample);
			
			
			Empleados e1 = new Empleados("Mario", "Hernandez");
			System.out.println(e1.hashCode());
			Empleados e2 = new Empleados("Mario", "Hernandez");
			System.out.println(e2.hashCode());
			
			HashSet<Empleados> lEmpleados = new HashSet<Empleados>();
			lEmpleados.add(e1);
			lEmpleados.add(e2);
			
			HashMap<Empleados, Integer> diccionario = new HashMap<Empleados, Integer>();
			diccionario.put(e1, 1);
			diccionario.put(e2, 2);
			System.out.println(diccionario.size());
			
			System.out.println(diccionario.containsValue(1));
			
			System.out.println(String.format("Nombre del Empleado : %s", e1));
			System.out.println((e1.toString() == e2.toString()));
			System.out.println((e1.toString().equals(e2.toString())));
	}

}
