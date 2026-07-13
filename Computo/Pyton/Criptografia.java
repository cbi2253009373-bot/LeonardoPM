import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Alfabeto
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        char[] letras = alfabeto.toCharArray();

        // Valores del alfabeto
        int[] valores = new int[letras.length];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i + 11;
        }

        // Pedir frase
        System.out.print("Ingrese la frase: ");
        String frase = sc.nextLine().toUpperCase();//saber que topercase es para convertir a mayusculas

        char[] mensaje = frase.toCharArray();

        // Convertir la frase a números
        System.out.println("\nFrase convertida a números:");

        for (int i = 0; i < mensaje.length; i++) {

            if (mensaje[i] == ' ') {
                System.out.print("   ");
                continue;
            }

            for (int j = 0; j < letras.length; j++) {

                if (mensaje[i] == letras[j]) {
                    System.out.print(valores[j] + " ");
                    break;
                }
            }
        }

        // Pedir los dos números primos
        System.out.print("\n\nIngrese el primer número primo: ");
        int primo1 = sc.nextInt();

        System.out.print("Ingrese el segundo número primo: ");
        int primo2 = sc.nextInt();

        // Calcular módulo
        int modulo = primo1 * primo2;

        // Calcular fi(m)
        int fi = (primo1 - 1) * (primo2 - 1);

        System.out.println("\nMódulo (m) = " + modulo);
        System.out.println("Fi(m) = " + fi);

        // Pedir el exponente e
        int e;

        do {
            System.out.print("Ingrese un exponente coprimo con Fi(m): ");
            e = sc.nextInt();

            if (mcd(e, fi) != 1) {
                System.out.println("El exponente no es coprimo con Fi(m). Intente nuevamente.");
            }

        } while (mcd(e, fi) != 1);

        System.out.println("Exponente válido: " + e);

    }

    // Máximo común divisor
    public static int mcd(int a, int b) {

        while (b != 0) {
            int aux = b;
            b = a % b;
            a = aux;
        }

        return a;
    }
    
}