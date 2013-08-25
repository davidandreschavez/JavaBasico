/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2508.Clase3.excepciones.cuentas;

/**
 *
 * @author PFR
 */
public class SaldoInsuficienteException extends Exception{
    
    public double saldo, cuantoDesea;

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene "+ saldo + " soles. No puede prestarse " + cuantoDesea +" soles.");

    this.saldo = saldo;
    this.cuantoDesea = cuantoDesea;
    }    

}
