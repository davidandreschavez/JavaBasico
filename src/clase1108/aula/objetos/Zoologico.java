/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1108.aula.objetos;

/**
 *
 * @author PFR
 */
public class Zoologico {
    public static void main(String[] args) {
         Zoologico.doHerencia();
    }
    
    public static void doHerencia(){
        // con herencia
        Tigre tiger = new Tigre();
        tiger.setNumeroPatas(4);
        tiger.hacerRuido();
        //System.out.println(tiger.setNumeroPatas());
        tiger.hacerRuido(true);
        tiger.hacerRuido("holaaaa");
        
        Gallina pollito = new Gallina();
        pollito.setNumeroPatas(2);
        pollito.hacerRuido();
        
       
        
        
    }
    
    public static void doInstancia(){
        
        // Instanciar
            Animal tigre = new Animal(); 
            // Definiendo objeto
            tigre.setNobre("Tigre");
            
            System.out.println(tigre.getNobre());
            tigre.hacerRuido();
        
    }
}
