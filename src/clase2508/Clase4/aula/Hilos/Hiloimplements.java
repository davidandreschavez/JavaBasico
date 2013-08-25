/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase4.aula.Hilos;

import java.util.Iterator;

/**
 *
 * @author PFR
 */
public class Hiloimplements implements Runnable{

    @Override
    public void run() {
      for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}
    
    }
    
    
}
