/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase3.excepciones.cuentas;

/**
 *
 * @author PFR
 */
public class Cuenta {
     private long idCuenta;
     private double saldoActual;
    
    public Cuenta(long idCuenta) {        
        this.idCuenta = idCuenta;
        this.saldoActual=5000d;
    }
    
    public void retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
        //double saldoActual = 5000;
        if(this.saldoActual < cuantoDesea){
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
        } 
            System.out.println(" Monto Restante" + (saldoActual - cuantoDesea));
        }
    }

    

