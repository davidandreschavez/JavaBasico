/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.Interfaces;

import clase1108.aula.universo.Interfaces.Humano;


public class Hombre implements SerVivo, Humano{

    @Override
    public void alimentarse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("COMER");
    }

    @Override
    public void Comunicarse() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("HABLAR");
    }

    @Override
    public void reproducirse() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("SEXUALMENTE");
    }

    @Override
    public void contaminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
