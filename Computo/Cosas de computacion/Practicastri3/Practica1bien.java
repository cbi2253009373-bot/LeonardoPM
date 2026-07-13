import java.util.Scanner;

public class Practica1bien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numer = new int[5];

        for (int i = 0; i < numer.length; i++) {
            System.out.print("Ingresa numero " + (i+1) + ": ");
            numer[i] = sc.nextInt();
        }

        System.out.println("Suma: " + suma(numer));
        System.out.println("Promedio: " + promedio(numer));
        System.out.println("Mayor: " + mayor(numer));

        int[] triple = numeroTriple(numer);
        System.out.print("Triple: ");
        for (int n : triple) {
            System.out.print(n + " ");
        }
        sc.close();
    }

    public static int suma(int[] arr) {
        int acum = 0;
        for (int n : arr) {
            acum += n;
        }
        return acum;
    }

    public static double promedio(int[] arr) {
        return (double) suma(arr) / arr.length;
    }

    public static int mayor(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static int[] numeroTriple(int[] arr) {
        int[] nuevo = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nuevo[i] = arr[i] * 3;
        }
        return nuevo;
    }
}
    

