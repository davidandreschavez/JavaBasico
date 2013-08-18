/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1808.aula.usoInterface;

/**
 *
 * @author PFR
 */
public class Oracion implements Capitalizable{
    private String texto;
    
    public Oracion(String texto){
        this.texto= texto;
    }

     public String agregaPalabra(String t) {
         texto=texto.concat(" "+t);
         return texto;
    }

      
    @Override
    public String cambiaMayuscula(){
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return texto.toLowerCase();
   }
    
}
