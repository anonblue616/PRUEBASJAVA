class bici {
    void SoyBici(){
        System.out.println("me compre una bicicleta ");
    }
}
class soycarro extends bici {
    void SoyBici() {
        System.out.println("como me quedo chica la moto me compre un carro");
    }
}

class moto extends bici {

    void SoyBici() {
        System.out.println("como la bici era muy lenta se me aloco la modifique, le puse un motor y se convirtio en una moto");
    }

}

public class polimorfismo3 {
    public static void main(String[] args) {
        bici LaMAmalona;
        LaMAmalona = new bici();
        LaMAmalona.SoyBici();
        LaMAmalona = new moto();
        LaMAmalona.SoyBici();
        LaMAmalona = new soycarro();
        LaMAmalona.SoyBici();

    }

}


