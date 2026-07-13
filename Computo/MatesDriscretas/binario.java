//Convertir numeros a Binario

import java.util.Scanner; // Importa la clase Scanner para poder leer datos desde el teclado.

public class binario {

    public static void main(String[] args) {

        // Se crea un objeto Scanner para capturar la entrada del usuario.
        Scanner sc = new Scanner(System.in);

        // Declaración de variables:
        // num: almacena el número ingresado por el usuario.
        // numOriginal: guarda el número original para mostrarlo al final.
        // res: almacena el residuo de la división entre 2.
        int num, numOriginal, res;

        // Variable donde se irá formando el número en binario.
        String binario;

        // Solicita al usuario que ingrese un número.
        System.out.println("Ingresa numero: ");

        // Lee el número escrito por el usuario.
        num = sc.nextInt();

        // Guarda una copia del número original antes de modificarlo.
        numOriginal = num;

        // Si el número es negativo, se convierte a positivo.
        // Esto facilita el cálculo del binario.
        if (num < 0) {
            num = num * (-1);
        }

        // Inicializa la cadena vacía donde se almacenará el resultado.
        binario = "";

        // Caso especial: si el número es 0,
        // su representación binaria también es 0.
        if (num == 0) {

            binario = "0";

        } else {

            // Mientras el número sea mayor que cero,
            // se seguirá obteniendo su equivalente en binario.
            while (num > 0) {

                // Obtiene el residuo de dividir el número entre 2.
                // El residuo siempre será 0 o 1.
                res = num % 2;

                // Agrega el residuo al inicio de la cadena.
                // Se coloca al principio porque el primer residuo obtenido
                // corresponde al último bit del número binario.
                binario = res + binario;

                // Divide el número entre 2.
                // Al ser una división entre enteros, se elimina la parte decimal.
                num = num / 2;
            }
        }

        // Muestra el número original ingresado por el usuario.
        System.out.println("El numero: " + numOriginal);

        // Si el número original era negativo,
        // simplemente agrega el signo menos al resultado binario.
        if (numOriginal < 0) {

            System.out.println("En binario: -" + binario);

        } else {

            // Si era positivo, muestra el binario normalmente.
            System.out.println("En binario: " + binario);
        }

    }
}