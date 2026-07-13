import java.util.Scanner;
public class Maatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[4][4];
        int[][] t = new int[4][4];

        // 1. Llenar la matriz original
        System.out.println("Ingresa los valores de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }

        // 2. Generar la transpuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                t[j][i] = m[i][j];
            }
        }

        // 3. Imprimir matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        // 4. Imprimir matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
} 

