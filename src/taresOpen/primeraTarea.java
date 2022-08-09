package taresOpen;

public class primeraTarea {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.calcularPuertas();
        System.out.println(miCoche.numeroPuertas);
        miCoche.calcularPuertas();
        miCoche.calcularPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    public int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}

class Coche {

    int numeroPuertas = 0;

    public int calcularPuertas() {
        this.numeroPuertas++;
        return numeroPuertas;
    }
}
