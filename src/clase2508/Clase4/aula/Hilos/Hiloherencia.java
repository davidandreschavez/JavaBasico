/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase4.aula.Hilos;

/**
 *
 * @author PFR
 */
public class Hiloherencia extends Thread{
  String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
        @Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}
	}

    
}
