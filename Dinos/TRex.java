package Dinos;

public class TRex extends Dinos {
    private int año;
    private  String lugar;

    public TRex(int tamaño, int patas, String tipo, String alimentacion, int año, String lugar) {
        super(tamaño, patas, tipo, alimentacion);
        this.año= año;
        this.lugar= lugar;

    }

    public int getAño() {
        return año;
    }

    public String getLugar() {
        return lugar;
    }

    /*@Override
    public String mostrarDatos() {

        return "hay dinosaurio de tamaño: "+getTamaño()+"tiene :"+getPatas()+"patas "+"este dinosaurio es un "+getTipo()+""
                +"este dinosaurio su alimentacon es " +getAlimentacion()
                +"pero este dinosaurio tiene " +año+ "años este vivio en "+lugar ;
    }*/
    void mensaje(){

        System.out.println("hay dinosaurio de tamaño: "+getTamaño()+"tiene :"+getPatas()+"patas "+"este dinosaurio es un "+getTipo()+""
                +"este dinosaurio su alimentacon es " +getAlimentacion()
                +"pero este dinosaurio tiene " +año+ "años este vivio en "+lugar );
        main();
    }
}
