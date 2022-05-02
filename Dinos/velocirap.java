package Dinos;

public class velocirap extends Dinos{
    private int velocidad;
    public velocirap(int tamaño, int patas, String tipo, String alimentacion, int año, String lugar) {
        super(tamaño, patas, tipo, alimentacion);
        this.velocidad= velocidad;

    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String mostrarDatos() {
        return "hay dinosaurio de tamaño: "+getTamaño()+"tiene :"+getPatas()+"patas "+"este dinosaurio es un "+getTipo()+""
                +"este dinosaurio su alimentacon es " +getAlimentacion()
                +"pero este dinosaurio tiene una velocidad de" +velocidad;
    }
}
