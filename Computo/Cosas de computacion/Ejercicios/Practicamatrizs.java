import java.util.Scanner;
public class Practicamatrizs {
    //Parametros
private static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int [][] m = new int[4][4];
        int [][] t = new int[4][4];
        //Ingresar datos a la matriz
        for (int i = 0; i < m.length ; i++){
            for(int j = 0 ;j < m[0].length; j++){
                System.out.println("Ingresa tu dato [" + i +"," + j + "]" );
                m [i][j] = sc.nextInt(); 
            }
        }
        //la matriz transpuesta
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }
        //imprimir matriz ariginal 
        System.out.println("La matriz original es:");
        for (int i =  0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                System.out.printf ("[%d] ", m[i][j]);
            }
            System.out.println("\n");
        }
        //imprimir matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for(int i = 0; i< t.length; i++){
            for (int j = 0; j < t[0].length; j++){
                System.out.printf("[%d] ", t[i][j]);
            }
            System.out.println("\n");
        }

        //Matriz duplicada
        int [][] d = new int[4][4];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                d[i][j] = m[i][j];
            }
        }
        //imprimir matriz duplicada
        System.out.println("La matriz duplicada es:");
        for(int i = 0; i< d.length; i++){
            for (int j = 0; j < d[0].length; j++){
                System.out.printf("[%d] ", d[i][j]*2);
            }
            System.out.println("\n");
        }
    }
}
