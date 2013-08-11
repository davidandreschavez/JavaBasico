/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.figuras;

/**
 *
 * @author PFR
 */
public class Cuadrado extends Shape {

    @Override
    public Double getArea(){
        
        Double resultado = this.getAlto()*getAlto();
        return resultado;
        
    }

    
       
}
