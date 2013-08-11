/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.objetos;

/**
 *
 * @author PFR
 */
public class Gallina extends Animal{
    
    String pico;
// cosntructor
    public Gallina(){
        this.setNumeroPatas(2);
    }
    /*
    public Gallina (String nombre,int patas){
        this.setNobre(nombre);
        this.setNumeroPatas(patas);
        
    }
    
    */
  
     public Gallina (String nombre){
        this.setNobre(nombre);
        this.setNumeroPatas(2);
        
    }
    
    
    @Override
    public void hacerRuido() {
        //super.hacerRuido(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("coc coc");
    }
    
    public void picar(){
    System.out.println("pica pica");
}  
 
}
