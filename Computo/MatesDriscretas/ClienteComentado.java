import java.util.Scanner;

public class ClienteComentado {
    public static void main(String[] args) {

        // Scanner para leer datos desde teclado.
        Scanner sc = new Scanner(System.in);

        // Clave pública: a = g^x mod p.
        System.out.println("Ingrese el valor de a: ");
        long a = sc.nextLong();

        // p debe ser un número primo.
        System.out.println("Ingrese el valor de primo: ");
        long primo = sc.nextLong();

        // g es un generador del grupo multiplicativo.
        System.out.println("Ingrese el valor de g: ");
        long g = sc.nextLong();

        // k es el exponente aleatorio del cifrado.
        long k = 0;

        // Se valida que 1 ≤ k ≤ p-2.
        do{
         System.out.println("Ingrese el valor de k: ");
         k = sc.nextLong();
        }while(k <= 0 || k > (primo-2));

        // Alfabeto usado para convertir letras en números.
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";

        System.out.println("Ingresa tu mensaje: ");

        // Lee el mensaje completo.
        String palabra = sc.nextLine();

        if (palabra.isEmpty()) {
            palabra = sc.nextLine(); //consume el salto de linea si se encuentra vacio
        }

        // Elimine el toUpperCase() para que no hayan errores con las minúsculas y los espacios en el alfabeto

        // Aquí se almacenará el mensaje en forma numérica.
        String resultado = "";

        System.out.println("Posición de Ñ: " + alfabeto.indexOf('Ñ'));//obtenemos la posicion de la letra Ñ en el alfabeto
        System.out.println("Código de Ñ: " + (alfabeto.indexOf('Ñ') + 11));//obtenemos el codigo de la letra Ñ sumando 11 a su posicion en el alfabeto

        // Convertir letras a números
        for (int i = 0; i < palabra.length(); i++) {

            // Obtiene cada carácter del mensaje.
            char letra = palabra.charAt(i);//obtenemos la letra en la posición i del mensaje

            // Busca la posición del carácter.
            int posicion = alfabeto.indexOf(letra);//sirve para buscar la posicion de la letra en el alfabeto

            // Si no pertenece al alfabeto se ignora.
            if (posicion == -1) {
                System.out.println("Caracter no válido: " + letra);
                continue;//si la letra no se encuentra en el alfabeto, se muestra un mensaje y se pasa a la siguiente letra
            }

            // Cada letra se representa con dos dígitos.
            int codigo = posicion + 11;

            System.out.println(letra + " = " + codigo);

            // Construye la cadena numérica.
            resultado += codigo;
        }

        System.out.println("\nCadena numérica: " + resultado);

        // Formar bloques

        // Arreglo donde se guardan los bloques del mensaje.
        String [] bloques = new String[resultado.length()];

        int contador = 0;

        // Bloque temporal.
        String bloque = "";

        // avanza de 2 en 2 para no partir los sintaxis numericos de las letras a la mitad
        for (int i = 0; i < resultado.length(); i += 2) {

            // Extrae el código de una letra.
            String letraCodigo = resultado.substring(i, i + 2); //substring sirve para extraer una parte de una cadena de texto usando la posicion inicial y la final

            // Intenta agregar otro código al bloque.
            String intento = bloque + letraCodigo;//concatenamos el bloque actual con el codigo completo de la siguiente letra

            // En ElGamal cada bloque debe cumplir m < p.
            if (Long.parseLong(intento) < primo) {//si el bloque formado es menor que m, se actualiza el bloque actual
                bloque = intento;
            } else {

                // Guarda el bloque actual.
                bloques[contador] = bloque;
                contador++;

                // Comienza un nuevo bloque.
                bloque = letraCodigo;//si el bloque formado es mayor o igual que m, se guarda el bloque actual y empieza en un nuevo bloque
            }
        }

        // Guarda el último bloque si existe.
        if (!bloque.isEmpty()) {//si queda un bloque pendiente, se guarda en el arreglo de bloques
            bloques[contador] = bloque;
            contador++;
        }

        System.out.println("\nBloques:");

        // Muestra todos los bloques.
        for (int i = 0; i < contador; i++) {
            System.out.println(bloques[i]);
        }

        // γ = g^k mod p.
        // Primer componente del cifrado ElGamal.
        long gama;
        gama = cuadradossucecivos(g, k, primo);

        String bloquesbeta = "";

        System.out.println("Bloques cifrados: ");

        //Error de compilacion
        for (int i = 0; i < contador; i++) {

            // β = a^k · m (mod p).
            // Segundo componente del cifrado.
            //bloque beta = a^k * bloques[i] (mod primo)
            //un bloque
            long beta = (cuadradossucecivos(a, k, primo) * Long.parseLong(bloques[i])) % primo; //para que sirve parselong
            //sirve para convertir un String a un long, ya que bloques[i] es un String y necesitamos un long para realizar la operación

            // Guarda todos los β generados.
            bloquesbeta = bloquesbeta + beta + " ";

        }

        // Se envía γ una sola vez.
        System.out.println("Gama: " + gama);

        // Se envían todos los β.
        System.out.println("Bloques beta: " + bloquesbeta);

     sc.close();
    }


    // Exponenciación modular por cuadrados sucesivos.
    // Reduce el costo de O(n) a O(log n).
    public static long cuadradossucecivos(long base, long exponente, long modulo) {

        // Resultado acumulado.
        long resultado = 1;

        // Reduce la base módulo p.
        long b = base % modulo;

        // Recorre los bits del exponente.
        while (exponente > 0) {

            // Si el bit es 1 multiplica al resultado.
            if ((exponente % 2) == 1) {
                resultado = (resultado * b) % modulo;
            }

            // Eleva la base al cuadrado módulo p.
            b = (b * b) % modulo;

            // Divide el exponente entre 2.
            exponente = exponente/ 2;
        }

        // Devuelve base^exponente mod p.
        return resultado;

    }
}
