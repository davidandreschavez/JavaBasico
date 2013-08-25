package clase2508.Clase3.excepciones;

import clase2508.Clase3.excepciones.cuentas.Cuenta;
import clase2508.Clase3.excepciones.cuentas.SaldoInsuficienteException;

public class TestExcepciones {
    
    public static void main(String[] args) {
       // TestExcepciones.doEjemplo4();
        
    }
    
    public  static void doEjemplo4 () throws SaldoInsuficienteException{
         Cuenta cuentaJose = new Cuenta(1212l);
         cuentaJose.retirarDeCajero(6000d);
    }    
        public static void doEjemplo2(){
        int x = (int)(Math.random() * 5);
        int y = (int)(Math.random() * 10);
        int[] z = new int[5];
        try {
            System.out.println("y/x gives " + (y/x));
            System.out.println("y is " + y + " z[y] is " + z[y]);
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic problem " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subscript problem " + e);
        } finally {
            System.out.println("Terminando la ejecución del método");
        }
        System.out.println("Continúa la ejecución del método....");
    }

          public static void doEjemplo3() {
        
        //int[] n=null; //= {11,22,33,44,55,66,77,88,99};
        
        try {
            int[]n ={11,22,33,44,55,66,77,88,99};
            
        for (int i=0; i<11;i++) {
            System.out.println( "Valor " + n[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error " +e.toString());
        }
        catch (NullPointerException e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
  
        
    
}

