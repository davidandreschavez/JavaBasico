/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.objetos;

/**
 *
 * @author PFR
 */
public class Tigre extends Animal{

    @Override
    public void hacerRuido() {
        System.out.println("rugir");
        //To change body of generated methods, choose Tools | Templates.
    }
   
    
    //sobre un metodo varias acciones overloading
    
    void hacerRuido(boolean molestar){
        if (molestar){
            System.out.println("rugir y zarpar");
        }
    }
    
    void hacerRuido (String mensaje){
          System.out.println(" rugir" + mensaje);
    }
    
}
