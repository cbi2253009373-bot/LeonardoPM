//MCD Algoritmo de Euclides
import java.util.Scanner; // Importa la clase Scanner para leer datos desde el teclado.

public class mcd {

    public static void main(String[] args) {

        // Declaración de las variables que almacenarán los dos números.
        int a, b;

        // Se crea un objeto Scanner para capturar la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Solicita el primer número.
        System.out.println("Ingresa un numero");

        // Guarda el primer número ingresado.
        a = sc.nextInt();

        // Solicita el segundo número.
        System.out.println("Ingresa otro numero");

        // Guarda el segundo número ingresado.
        b = sc.nextInt();

        // Llama al método recursivo para calcular el MCD
        // y muestra el resultado en pantalla.
        System.out.println("Maximo comun divisor: " + recursivo(a, b));
    }

    // Método recursivo que calcula el Máximo Común Divisor (MCD)
    // utilizando el algoritmo de Euclides.
    public static int recursivo(int a, int b) {

        // Caso base:
        // Si el segundo número es 0, el MCD es el primer número.
        if (b == 0) {

            return a;

        } else {

            // Caso recursivo:
            // Se vuelve a llamar al mismo método,
            // intercambiando los valores.
            // El nuevo primer número será b.
            // El nuevo segundo número será el residuo de a entre b.
            return recursivo(b, a % b);
        }
    }
}