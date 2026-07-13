//ecuaciones diofantinas
import java.util.Scanner;

public class EcDiof {

    //funcion para calcular el maximo comun divisor
    public static int mcd(int a, int b) {
        //Math.abs() es un metodo de la clase Math de Java.
        a = Math.abs(a); //obtiene el valor absoluto de a 
        b = Math.abs(b); //obtiene el valor absoluto de b
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //se piden los coeficientes de la ecuacion ax + by = c
        System.out.print("Ingrese el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el valor de c: ");
        int c = sc.nextInt();

        boolean encontrada = false; //sirve para saber si existe una solucion
        int x0 = 0; //guarda la primera solucion encontrada
        int y0 = 0;

        //se calcula el maximo comun divisor
        int divisor = mcd(a, b);

        //si c no es divisible entre el mcd, no existe solucion
        if (c % divisor != 0) {
            System.out.println("La ecuacion no tiene soluciones enteras.");
        } else {

            //se buscan valores enteros entre -100 y 100
            for (int x = -100; x <= 100; x++) {
                for (int y = -100; y <= 100; y++) {

                    //se verifica si cumplen la ecuacion
                    if ((a * x) + (b * y) == c) {
                        x0 = x;
                        y0 = y;
                        encontrada = true;
                        break;
                    }
                }

                //si ya encontro una solucion sale del ciclo
                if (encontrada) {
                    break;
                }
            }

            //si encontro una solucion la usa para generar las demas
            if (encontrada) {
                System.out.println("\nprimera solucion encontrada:");
                System.out.println("x = " + x0);
                System.out.println("y = " + y0);

                System.out.println("\ntodas las soluciones entre -100 y 100:");

                //se aplica la formula de las ecuaciones diofantinas
                for (int t = -100; t <= 100; t++) {
                    int x = x0 + (b / divisor) * t;
                    int y = y0 - (a / divisor) * t;

                    //solo se muestran las soluciones dentro del rango
                    if (x >= -100 && x <= 100 && y >= -100 && y <= 100) {
                        System.out.println("x = " + x + "    y = " + y);
                    }
                }
            } else {

                //si no encontro una solucion en el rango
                System.out.println("No se encontro una solucion entre -100 y 100.");
            }
        }

        //se cierra el scanner
        sc.close();
    }
}