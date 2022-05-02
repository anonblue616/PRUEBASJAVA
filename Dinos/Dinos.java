package Dinos;

public class Dinos {
    private int tamaño, patas;
    private String tipo, alimentacion;
    Dinos(){

    }
    public Dinos(int tamaño, int patas, String tipo, String alimentacion) {
        this.tamaño = tamaño;
        this.patas = patas;
        this.tipo = tipo;
        this.alimentacion = alimentacion;
    }

    public int getPatas() { return patas;}
    public int getTamaño() {return tamaño;}
    public String getAlimentacion() {return alimentacion;}
    public String getTipo() {return tipo;}

    public String mostrarDatos(){
        return "hay dinosaurio de tamaño: "+tamaño+"tiene :"+patas+"patas "+"este dinosaurio es un "+tipo+""
                +"este dinosaurio su alimentacon es "+alimentacion;
    }
}

