package Pre_ejercicios;

public class Animal {
    private int Patas;
    private String Tipo;
    private String Habitad;
    private String Comida;



    public Animal (int Patas, String Tipo, String Habitad, String Comida) {
        this.Patas = Patas;
        this.Tipo = Tipo;
        this.Habitad = Habitad;
        this.Comida = Comida;

    }

    public int getPatas() {
        return Patas;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getHabitad() {
        return Habitad;
    }

    public String getComida() {
        return Comida;
    }

}
