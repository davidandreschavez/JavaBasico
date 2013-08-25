/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.objetos;

import clase1108.aula.Zoologico.Animal;

/**
 *
 * @author PFR
 */
public class Serpiente extends Animal{
    private int largo;

    @Override
    public void hacerRuido() {
        System.out.println("ZIP ZIP");
    }
    
}
