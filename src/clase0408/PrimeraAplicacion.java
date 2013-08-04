
package clase0408;

public class PrimeraAplicacion {

    public static void main(String[] args) {
        
        PrimeraAplicacion.Ejercicio8();
        //PrimeraAplicacion.ejercicio7();
        //PrimeraAplicacion.ejemploMatriz();
        //PrimeraAplicacion.ejemploMatrizB();
        /*int edad=25;
        final double pi = 3.1415;
        String Nombre ="Jose", Apellido ="Apellidos Completos";
        System.out.println(edad);
        System.out.println(Nombre+" "+Apellido);
        System.out.println(pi);
        int hora = 12;
        System.out.println(hora);
        double horasDecimal = hora;
        System.out.println(horasDecimal);     
        //Integer edads=19, talla =20;
        //edads.getint()==talla;
        
        
        PrimeraAplicacion.ejemploWhile();
        PrimeraAplicacion.ejemploDoWhile();
        PrimeraAplicacion.ejemploFor();
        PrimeraAplicacion.ejercicio3();
        PrimeraAplicacion.ejercicio4();
        PrimeraAplicacion.ejercicio5();
        
        //instancear
        //Date fechaNacimeinto 0 new Date();
        PrimeraAplicacion.ejercicio61();
        PrimeraAplicacion.ejercicio62();
        PrimeraAplicacion.ejercicio63();
        PrimeraAplicacion.ejercicio64();
        PrimeraAplicacion.ejercicio65();
        PrimeraAplicacion.ejercicio66();
        //PrimeraAplicacion.ejercicioCompraStrings();
        
        */
        
        
    }
    public static void Ejercicio8() {
        int mes=1;
        int[] meses ={30,28,30,31,30,31,30,31,30,31,30,31};
        System.out.println(meses[mes-1]);
    }
    public static void ejemploMatrizB() {
        int[][] matrizBidireccional = new int[5][2];
        matrizBidireccional[0][0]=145;
        matrizBidireccional[0][1]=195;

        matrizBidireccional[1][0]=145;
        matrizBidireccional[1][1]=195;

        matrizBidireccional[2][0]=145;
        matrizBidireccional[2][1]=195;

        matrizBidireccional[3][0]=145;
        matrizBidireccional[3][1]=195;

        for (int i = 0; i < matrizBidireccional.length; i++) {
            for (int j = 0; j < matrizBidireccional[i].length; j++) {
                System.out.println(matrizBidireccional[i][j]);
            }
            
        }
        
    }
    
    public static void ejemploMatriz() {
         int[] matrizNumeros = new int[5];
         matrizNumeros[0]=648;
         matrizNumeros[1]=2548;
         matrizNumeros[2]=68;
         matrizNumeros[3]=8;
         for (int i = 0; i < matrizNumeros.length; i++) {
             System.out.println(matrizNumeros[i]);
        }
    }
    
    
    
    public static void ejercicioSwitch() {
        int diaSeman =5;
        String textoSemana="";
        switch(diaSeman){
            case 1: 
                textoSemana="Domingo";
                break;
            case 2: 
                textoSemana="Domingo";
                break;
            case 3: 
                textoSemana="Domingo";
                break;    
            case 6: 
                textoSemana="Viernes";
                break;
            default:
                textoSemana="Otros";
                
        }
    }
    
    public static void ejemploFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
 
    }
    
    
    public static void ejemploWhile() {
        int contador=0;
        while(contador<10){
            System.out.println(contador);
            ++contador;
            
            if (contador==6){
                //break;
                ++contador;
                continue;
            }
       }
        
    }
    public static void ejemploDoWhile() {
        int contador=10;
        do{
            System.out.println(contador);
            ++contador;       
            System.out.println(contador);
            }while(contador<10);          
    }
    
    
 
    
    
    
    public static void ejercicio3() {
        float alturaCentimetros =1.54f;
        System.out.println(alturaCentimetros);
        int DNI =12453698;
        System.out.println(DNI);
        short edad1 =222;
        System.out.println(edad1);
        String sexo ="Femenino", canalTV="Warner";
        System.out.println(sexo + " "+canalTV);
    }
    
    public static void ejercicio4() {
        int numeroX = 10,numeroY=20;
        int numerotemporal = numeroX;
        numeroX = numeroY;
        numeroY = numerotemporal;
        System.out.println(numeroX + "" + numeroY);
    }
    public static void ejercicio5() {
        int x=5;
        int y=8;
        int z=6;  
        int solucion= x+y-3*z;
        System.out.println(solucion);
    }
    public static void ejercicio61() {
        float numero=7*(15+1)*2%2;     
        System.out.println(numero);
     }
    public static void ejercicio62() {
        boolean respuesta = 0.0/0.0 == 0.0 / 0.0;
        System.out.println(respuesta);
    }
    public static void ejercicio63() {
        boolean compara =(!true && false);
        System.out.println(compara);
    }
    public static void ejercicio64() {
        boolean tarea =( (3*4 >=12) && (3.5> 1+2f)) || (4<8);
        System.out.println(tarea);
    }
    public static void ejercicio65() {
        boolean tarea1 = !(true==false);
        System.out.println(tarea1);       
    }
    public static void ejercicio66() {
        boolean tarea2 =(!true==false);
        System.out.println(tarea2);
    }
    public static void ejercicioCompraStrings() {
        String animal1 = "Perro";
        String anumal2 ="Gato";
        
        boolean resultado = (animal1==anumal2);
        System.out.println(resultado);
    }
    
    
    
            
}
