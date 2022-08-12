package taresOpen;

public class Main {

    public static void main(String[] args) {
        numeros(500);
        mientras(1);
        para(2);
        por(1);
        estacion(5);
    }

    public static void numeros(int numeroIf) {

        if (numeroIf == 0) {
            System.out.println("el numero es 0");
        } else if (numeroIf < 0) {
            System.out.println("el numero es negativo");

        } else {
            System.out.println("el numero es positivo");
        }
    }

    public static void mientras(int numeroWhile) {

        while (numeroWhile <= 3) {
            System.out.println("se ejecuto funcion while y el numero es :" + numeroWhile);
            numeroWhile++;
        }

    }

    public static void para(int numeroWhile) {

        do {
            System.out.println("se ejecuto funcion do while y el numero es :" + numeroWhile);
            numeroWhile++;
            break;
        } while (numeroWhile <= 3);

    }

    public static void por(int numeroFor) {

        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("con for se imprime numeros " + numeroFor);

        }

    }

    public static void estacion(int estacion) {

        switch (estacion) {
            case 1:
                System.out.println("verano");
                break;
            case 2:
                System.out.println("invierno");
                break;
            case 3:
                System.out.println("otoño");
                break;
            case 4:
                System.out.println("primavera");

                break;
            default:
                System.out.println("no es ninguna");
        }
    }

    /*



Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
    estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje 
    por consola informando de la estación en la que está. También habrá que poner un default para 
    cuando el valor de la variable no sea una estación.
     */
}
