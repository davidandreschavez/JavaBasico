/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase4.aula.Hilos;

import clase2508.Clase4.aula.Colecciones.Aplicacion;

/**
 *
 * @author PFR
 */
public class Aplicacionhilos {
        
    public static void main(String[] args) {
        Aplicacionhilos.doHiloImplemens();
        //Aplicacionhilos.runhilo();
    }
        
    public static void doHiloImplemens() {
        Hiloimplements hilo = new Hiloimplements();
        Thread th = new Thread(hilo);
        th.start();
        
        //multiples
        Thread th1 = new Thread(hilo);
        th1.start();
        Thread th2 = new Thread(hilo);
        th2.start();
        Thread th3 = new Thread(hilo);
        th3.start();
        
    }
    
    public static void runhilo() {
        Aplicacionhilos.doHiloHerencia();
        Aplicacionhilos.doHiloHerencia();
        Aplicacionhilos.doHiloHerencia();
        Aplicacionhilos.doHiloHerencia();
        
    }
    
    public static void doHiloHerencia() {
        Hiloherencia hilo = new Hiloherencia();
        hilo.start();
    }
    
}
