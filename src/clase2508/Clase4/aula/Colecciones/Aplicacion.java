/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase4.aula.Colecciones;

import clase1108.aula.Zoologico.Animal;
import clase1108.aula.Zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author PFR
 */
public class Aplicacion {
    public static void main(String[] args) {
        Aplicacion.ejemploListAnimales();
        //Aplicacion.ejemploHashMap();
        //Aplicacion.ejemploHashSet();
        //Aplicacion.ejemploLinkedList();
        //Aplicacion.ejemplo1();
        
    }
    
    
    public static void ejemploListAnimales() {
        Tigre tigre1 = new Tigre("Jorge");
        Tigre tigre2 = new Tigre("Pepe"); 
        //Gallina gallina1 = new Gallina("pepa");
        
        List<Animal> listaanimales = new ArrayList<>();
        listaanimales.add(tigre2);
        listaanimales.add(tigre1);
        //istaanimales.add(gallina1);
        for (Animal e : listaanimales) {
		System.out.println(e.getNobre());
	}
        
    }
    public static void ejemploHashMap() {
        
       
    	Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashMap
        HashMap<Integer, Estudiante> mapEstudiantes = new HashMap<Integer, Estudiante>();
        mapEstudiantes.put(100525, e1);
        mapEstudiantes.put(100526, e2);
        mapEstudiantes.put(100527, e3);
        mapEstudiantes.put(100527, e3);// asi se repita no lo atraca
        
        Estudiante e = mapEstudiantes.get(100526);
        //System.out.println(e.getNombres() );

        Collection<Estudiante> co = mapEstudiantes.values();
        for (Estudiante es : co) {
		System.out.println(es.getNombres());
		}        

        
    }
    
    public static void ejemploHashSet() {
        
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashSet
        HashSet<Estudiante> Estudiantes = new HashSet<Estudiante>();
        Estudiantes.add(e1);
        Estudiantes.add(e2);
        Estudiantes.add(e3);
        Estudiantes.add(e1);
        
        for (Estudiante e : Estudiantes) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}
}

    
    
    public static void ejemploLinkedList() {
        
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // LinkedList
        LinkedList<Estudiante> pilaEstudiantes = new LinkedList<>();
        pilaEstudiantes.addFirst(e1);
        pilaEstudiantes.addFirst(e2);
        pilaEstudiantes.addLast(e3);
        
        ListIterator<Estudiante> iterador = pilaEstudiantes.listIterator();
        while(iterador.hasNext()){
            Estudiante e = (Estudiante) pilaEstudiantes.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(pilaEstudiantes.size());
  }

        
        
        
 
    
    
    public static void ejemploArrayList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        Estudiante e3 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	
        
        // ArrayList
    List<Estudiante> listaEstudiantes = new ArrayList<>();
      listaEstudiantes.add(e1);
      listaEstudiantes.add(e2);
      listaEstudiantes.add(e3);
        
      for (Estudiante e : listaEstudiantes) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}
           
      
        Collections.sort(listaEstudiantes);
        
        for (Estudiante e : listaEstudiantes) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}
  }

        
    }

