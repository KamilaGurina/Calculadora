public class Division {
    public static double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0; // o cualquier valor que quieras para manejar el error
        }
        return a / b;
    }
}
