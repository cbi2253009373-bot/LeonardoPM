import java.util.Scanner;

public class RSApriv1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = 3, q = 11, e = 3;
        int fi = (p - 1) * (q - 1);
        int m = p * q;

        System.out.println("p(m): " + fi);
        System.out.println("m: " + m);

        System.out.print("Dame una palabra: ");
        String palabra = sc.nextLine().toUpperCase();//convertimos la palabra a mayúsculas para que coincida con el alfabeto definido

        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";
        
        System.out.println("Posición de Ñ: " + alfabeto.indexOf('Ñ'));//obtenemos la posición de la letra Ñ en el alfabeto
        System.out.println("Código de Ñ: " + (alfabeto.indexOf('Ñ') + 11));//obtenemos el código de la letra Ñ sumando 11 a su posición en el alfabeto
        String resultado = "";

        // Convertir letras a números
        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);//obtenemos la letra en la posición i de la palabra
            int posicion = alfabeto.indexOf(letra);//sirve para buscar la posicion de la letra en el alfabeto

            if (posicion == -1) {
                System.out.println("Caracter no válido: " + letra);
                continue;//si la letra no se encuentra en el alfabeto, se muestra un mensaje y se pasa a la siguiente letra
            }

            int codigo = posicion + 11;

            System.out.println(letra + " = " + codigo);
            resultado += codigo;
        }

        System.out.println("\nCadena numérica: " + resultado);

        // Formar bloques
        String[] bloques = new String[resultado.length()];
        int contador = 0;

        String bloque = "";

        for (int i = 0; i < resultado.length(); i++) {

            String intento = bloque + resultado.charAt(i);//concatenamos el bloque actual con el siguiente dígito de la cadena numérica

            if (Integer.parseInt(intento) < m) {//si el bloque formado es menor que m, se actualiza el bloque actual
                bloque = intento;
            } else {
                bloques[contador] = bloque;
                contador++;
                bloque = "" + resultado.charAt(i);//si el bloque formado es mayor o igual que m, se guarda el bloque actual y se inicia un nuevo bloque con el dígito actual
            }
        }


        if (!bloque.isEmpty()) {//si queda un bloque pendiente, se guarda en el arreglo de bloques
            bloques[contador] = bloque;
            contador++;
        }

        System.out.println("\nBloques:");

        for (int i = 0; i < contador; i++) {
            System.out.println(bloques[i]);
        }

        // Cifrado RSA
        String mensajeCifrado = "";

        System.out.println("\nCifrado:");

     for (int i = 0; i < contador; i++) {
 
     int numero = Integer.parseInt(bloques[i]);//convertimos el bloque actual a un número entero
 
     long cifrado = cuadradosSucesivos(numero, e, m);//llamamos a la función cuadradosSucesivos para calcular el cifrado del bloque actual

     System.out.println(numero + "^" + e + " mod " + m + " = " + cifrado);

     mensajeCifrado += cifrado + " ";
      }

     System.out.println("\nMensaje cifrado:");
      System.out.println(mensajeCifrado);

     sc.close();
    }

    public static long cuadradosSucesivos(int base, int exponente, int modulo) {
  
     long resultado = 1;
     long b = base % modulo;

     while (exponente > 0) {
        if (exponente % 2 == 1) {
            resultado = (resultado * b) % modulo;
        }
        b = (b * b) % modulo;
        exponente /= 2;
     }
     return resultado;
    }
}
