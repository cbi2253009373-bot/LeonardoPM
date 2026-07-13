import java.util.Scanner;
public class Cliente2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        long a = sc.nextLong();
        System.out.println("Ingrese el valor de primo: ");
        long primo = sc.nextLong();
        System.out.println("Ingrese el valor de g: ");
        long g = sc.nextLong();
        long k = 0;
        do{
         System.out.println("Ingrese el valor de k: ");
         k = sc.nextLong();
        }while(k <= 0 || k > (primo-2));

        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";
        System.out.println("Ingresa tu mensaje: ");
        String palabra = sc.nextLine();
        palabra = sc.nextLine().toUpperCase();//convertimos la palabra a mayúsculas para que coincida con el alfabeto definido
        String resultado = "";
        System.out.println("Posición de Ñ: " + alfabeto.indexOf('Ñ'));//obtenemos la posición de la letra Ñ en el alfabeto
        System.out.println("Código de Ñ: " + (alfabeto.indexOf('Ñ') + 11));//obtenemos el código de la letra Ñ sumando 11 a su posición en el alfabeto

        // Convertir letras a números
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);//obtenemos la letra en la posición i del mensaje
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
        String [] bloques = new String[resultado.length()];
        int contador = 0;

        String bloque = "";

        for (int i = 0; i < resultado.length(); i++) {

            String intento = bloque + resultado.charAt(i);//concatenamos el bloque actual con el siguiente dígito de la cadena numérica

            if (Long.parseLong(intento) < primo) {//si el bloque formado es menor que m, se actualiza el bloque actual
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
         
        //calculamos gama
        long gama;
        gama = cuadradossucecivos(g, k, primo);
        String bloquesbeta = "";
        System.out.println("Bloques cifrados: ");
        //Error de compilacion
        for (int i = 0; i < contador; i++) {
            //bloque beta = a^k * bloques[i] (mod primo)
            //un bloque
            long beta = (cuadradossucecivos(a, k, primo) * Long.parseLong(bloques[i])) % primo; //para que sirve parselong
            //sirve para convertir un String a un long, ya que bloques[i] es un String y necesitamos un long para realizar la operación
            bloquesbeta = bloquesbeta + beta + " ";

        }
        System.out.println("Gama: " + gama);
        System.out.println("Bloques beta: " + bloquesbeta);

     sc.close();
    }


    
    public static long cuadradossucecivos(long base, long exponente, long modulo) {
        long resultado = 1;
        long b = base % modulo;

        while (exponente > 0) {
            if ((exponente % 2) == 1) {
                resultado = (resultado * b) % modulo;
            }
            b = (b * b) % modulo;
            exponente = exponente/ 2;
        }
        return resultado;
       
    }
}
