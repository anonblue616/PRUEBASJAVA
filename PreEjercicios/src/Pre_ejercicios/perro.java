package Pre_ejercicios;

public class perro extends Animal {
    private String raza;
    private String tamaño;
    private String nombre;
    private String dueño;

    // este es el constructor
    public perro(int Patas, String Tipo, String Habitad, String Comida, String raza, String tamaño, String nombre, String dueño){
        super (Patas,Tipo,Habitad,Comida);
        this.raza = raza;
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.dueño = dueño;
    }

    // este es un metodo

    public void mostrarDatos() {
        System.out.println("Patas: " +getPatas() + "\nTipo: "+getTipo()+"\nHabitad: "+getHabitad()+ "\nComida: "+getComida()+ "\nraza: "+raza+ "\ntamaño: "+tamaño+ "\nnombre: "+nombre+ "\ndueño: "+dueño);
    }
}

