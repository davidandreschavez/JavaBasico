
package clase1108.aula.objetos;


public class Animal {
    //Atributo Caracteristica
    private int numeroPatas;
    private Double tamaño;
    private String especie;
    private String nobre;
    // Metodos o Acciones
    public void hacerRuido(){
        System.out.println("ZZZZZZZZZZZ");
        
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public String getNobre() {
        return nobre;
    }

    public void setNobre(String nobre) {
        this.nobre = nobre;
    }
    
    // get ansd set
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
