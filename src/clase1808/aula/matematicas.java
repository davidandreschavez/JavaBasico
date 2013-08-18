/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1808.aula;

/**
 *
 * @author PFR
 */
public class matematicas {
 
    public static void main(String[] args) {
        //matematicas.getConstants();
        System.out.println(matematicas.doOperciones());
        matematicas.doOperaciones2();
    }
    
    public static void doOperaciones2(){
        System.out.println(Math.cos(10d));
        System.out.println(Math.exp(20d));
        
    }
    
    public static double doOperciones(){
        return (Math.sqrt(144));
    }
            
    
    public static void getConstants(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    
}
