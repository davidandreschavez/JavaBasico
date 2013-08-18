/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1808.aula;
import java.util.Date;
/**
 *
 * @author PFR
 */
public class ClaseObjet {
    
    public static void main(String[] args) {
        //ClaseObjet.doEquals();
        //ClaseObjet.doEquals1();
        //ClaseObjet.doToString();
        //ClaseObjet.overriderToString();
        ClaseObjet.rareComparcion();
    }
    
    
    
    
    
    //Caso especial
    public static void rareComparcion(){
        Integer numeroA=12;//son valñores
        Integer numeroB=12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        // son objetos y no se igualan
        // esto sucede en el tratamiento de la BD
        //compara los valores
        
        if(numeroA==numeroB){
            System.out.println("iguales A y B");
        }
        // compara los objetos
        if(numeroX == numeroY){
            System.out.println("iguales X e Y ");
        }
        
        // para comprarar lops valroes de los objetos
        if(numeroX.intValue()==numeroY){
            System.out.println("...los valores de numeroX y Numero Y son iguales por intValue");
        }
        
        if(numeroX.equals(numeroY)){
            System.out.println("iguales X eY por equals");
        }
        
    }
    
    
    //sobre escribir clases
    public static void overriderToString(){
        ClaseObjet myObjet = new ClaseObjet();
        System.out.println(myObjet.toString());
                
    }
    @Override  
    //Override para que yo lo vea que se sobrescrive el padre      
    public String toString(){
        return "Explicando sobreescritura";
    }
    
    public static void doToString(){
        Date fechaNacimiento = new Date();
        System.out.println(fechaNacimiento.toString());
        
    }
    
    public static void doEquals1(){
        
        Date fechaNacimiento = new Date();
        Date fechaCumpleaños = new Date();//ambos apuntan al mismo objeto
        //compara las estructuras de objetos
        if (fechaNacimiento==fechaCumpleaños){
            System.out.println("Iguales");
        }
        //compara contenidos de los objetos
        if(fechaNacimiento.equals(fechaCumpleaños)){
            System.out.println("iguales por equals ");
        }
                       
    }
    
    public static void doEquals(){
        
        Date fechaNacimiento = new Date();
        Date fechaCumpleaños = fechaNacimiento;//ambos apuntan al mismo objeto
        if (fechaNacimiento==fechaCumpleaños){
            System.out.println("Iguales");
        }
                       
    }
    
    
    
}
