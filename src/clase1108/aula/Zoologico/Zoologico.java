/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 package clase1108.aula.Zoologico;

/**
 *
 * @author PFR
 */
public class Zoologico {
    public static void main(String[] args) {
         //Zoologico.doHerencia();
         //Zoologico.docosntructor();
        
       
        
    }
    
    public static void doCasting2(){
        Animal[] animales = {new Tigre(), new Gallina("MAMBA"), new Gallina("PEPA")};
        
        for (Animal animal : animales) {
            animal.printNombrePatas();
            if (animal instanceof Tigre){
                ((Tigre) animal).hacerRuido(true);
            }
        }
    
    }
    
    public static void executeCasting(){
        Gallina gallina=new Gallina();
        Zoologico.doCasting(gallina);
        
        Zoologico.doCasting(new Tigre());
    } 
        
    
    
  

    
    
    
    public static void docosntructor(){
        Gallina pepa = new Gallina();
        pepa.setNobre("PEPA");
       // pepa.setNumeroPatas(2);
        pepa.printNombrePatas();
        
        Gallina manba = new Gallina("MAMBA");
        manba.printNombrePatas();
        
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
