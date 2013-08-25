
package clase1108.aula.Zoologico;


public class Animal {
    //Atributo Caracteristica
    private int numeroPatas;
    private Double tamaño;
    private String especie;
    private String nombre;
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
        return nombre;
    }

    public void setNobre(String nobre) {
        this.nombre = nobre;
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
    

void printNombrePatas(){
    System.out.println(this.nombre + " " + this.numeroPatas);
}

    
}
