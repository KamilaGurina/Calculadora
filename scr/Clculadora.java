import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese primer número: ");
        double a = teclado.nextDouble();
        System.out.print("Ingrese segundo número: ");
        double b = teclado.nextDouble();

        System.out.println("Suma: " + Suma.calcular(a, b));
        System.out.println("Resta: " + Resta.calcular(a, b));
        System.out.println("Multiplicación: " + Multiplicacion.calcular(a, b));
        System.out.println("División: " + Division.calcular(a, b));
    }
}
