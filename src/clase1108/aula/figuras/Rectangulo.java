/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.figuras;

/**
 *
 * @author PFR
 */
public class Rectangulo extends Shape{

    @Override
    public Double getArea() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Double resultado = this.getAlto()*getAncho();
        return resultado;  
        
    }
    
    
}
