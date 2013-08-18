/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1808.aula;

/**
 *
 * @author PFR
 */
public class Caracteres {
    public static void main(String[] args) {
    
        Caracteres.doContact();
        Caracteres.doExtraer();
        Caracteres.doReemplazar();
        Caracteres.doStringBuffer();
        
    }
    
    public static void doContact(){
        
        String nombre = "James";
		String apellido = "Gosling";
		
		if(nombre.equals("James")) {
			System.out.println(nombre+" "+apellido);
		}
		String completo = nombre.concat(" "+apellido);
		if(nombre.equals("James")) {
			System.out.println(completo);
		}       
    }
    
    public static void doExtraer(){
        String texto = "Tecsup";		
	System.out.println("Número de Caracteres:\t "+texto.length()+"\n");		
		for (int i=0; i<texto.length(); i++) {			
			System.out.println(texto.substring(i,i+1)+"\n");
	}
       
    }
    
    public static void doReemplazar(){
        String texto = "java permite crear java applets, javabeans y java servlets";	
        System.out.println(texto.replaceAll("java","JAVA"));	
    }
    
    public static void doStringBuffer(){
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
		
		sb.insert(11," en");
		sb.delete(21,sb.length());
		
		System.out.println(sb);
                System.out.println("Esta en la posicion: "+sb.indexOf("Bas"));    
                System.out.println(sb.lastIndexOf("T"));

    }
            
}
