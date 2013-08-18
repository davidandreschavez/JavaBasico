/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1808.aula.usoInterface;

/**
 *
 * @author PFR
 */
public class UsoInterface {
    
    public static void main(String[] args) {
        
        Capitalizable[] Listado = new Capitalizable[3];   

        Listado[0] = new Palabra("Programacion en Java");
        Listado[1] = new Palabra("Tecsup");
        Listado[2] = new Oracion("Curso Java Basico - Tecsup");        

      //  for (int i=0; i<Listado.length;i++){
//	        System.out.println( "Texto " + i + ": " + Listado[i].cambiaMayuscula());
//	}

        for (Capitalizable item : Listado) {
            System.out.println(item.cambiaMayuscula());
        }
        
        
    }
    
    
}
