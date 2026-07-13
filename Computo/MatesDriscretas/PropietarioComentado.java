import java.util.Scanner;

public class PropietarioComentado {
    public static void main (String  [] args){

      // Scanner para leer datos desde teclado.
      Scanner sc = new Scanner (System.in);

      // Mismo alfabeto usado durante el cifrado.
      String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";

      // Convierte el alfabeto en un arreglo de caracteres.
      char [] letras = alfabeto.toCharArray();

      // Arreglo con los códigos numéricos de cada letra.
      int [] valores = new int[letras.length];

      // Asigna a cada letra un código desde 11.
      for (int i = 0; i < valores.length; i++) {
          valores[i] = i + 11;
      }

      long primo, exponente, g,a;

      // p define el grupo donde opera ElGamal.
      System.out.println("Ingrese un numero primo: ");
      primo = sc.nextLong();

      // Clave privada del propietario.
      System.out.println("Ingrese el exponente: ");
      exponente = sc.nextLong();

      // Generador del grupo multiplicativo.
      System.out.println("Ingrese el generador: ");
      g = sc.nextLong();

      // Calcula la clave pública: a = g^x mod p.
      a = cuadradossucesivos(g, exponente, primo);

      System.out.println("El valor de a es: " + a);
      System.out.println("El valor de g es: "+ g);
      System.out.println("El valor del primo es: "+ primo);

      // Recibe γ enviado por el cliente.
     System.out.println("Ingresa tu gama");
     int gama = sc.nextInt();

     // Recibe todos los β cifrados.
     System.out.println("Ingresa tus bloques");
     sc.nextLine(); // limpia el Enter

     String bloquesbeta = sc.nextLine();

     // Separa cada bloque β recibido.
     String[] bloques = bloquesbeta.split(" ");//separa los bloques con el espacio

     //Teorema de Fermat (p - 1)

     // Calcula p-1-x usando el Pequeño Teorema de Fermat.
     long exponentecalculado = primo - 1 - exponente;

     //calcular gama-e = gamap-1-e mod primo

     // γ^(p-1-x) equivale al inverso de γ^x.
     long gamadescifrada = cuadradossucesivos(gama,exponentecalculado,primo);

     //calcular los bloques
     //pasar los bloques a letras

        // Descifra cada bloque recibido.
        for (int i = 0; i < bloques.length; i++) {

            // Ignora espacios adicionales.
            if (bloques[i].trim().isEmpty()) continue; // Previene fallos si hay espacios extra al final

            // Convierte β a número.
            long bloque = Long.parseLong(bloques[i]);

            // Recupera el mensaje: m = β·γ^(-x) mod p.
            long bloqueoriginal = (bloque * gamadescifrada) % primo;

            // convierte el bloque descifrado de nuevo a numeros en texto
            String cadenaNumeros = String.valueOf(bloqueoriginal);

            //si la longitud es impar por perdida de ceros iniciales,se ajusta para recuperar de 2 en 2
            if (cadenaNumeros.length() % 2 != 0) {
                cadenaNumeros = "0" + cadenaNumeros;
            }

            //asignando la letra correspondiente al alfabeto, iterando de 2 en 2
            for (int k = 0; k < cadenaNumeros.length(); k += 2) {

                // Obtiene el código de una letra.
                int valorLetra = Integer.parseInt(cadenaNumeros.substring(k, k + 2));

                // Busca la letra correspondiente.
                for (int j = 0; j < valores.length; j++) {

                    // Si encuentra el código imprime la letra.
                    if (valorLetra == valores[j]) {
                        System.out.print(letras[j]);
                        break;
                    }
                }
            }
        }

    // Salto de línea al finalizar.
    System.out.println();

    // Libera el Scanner.
    sc.close();

    }



    // Exponenciación modular eficiente.
    //metodo de aritmetica modular para calcular a = g^exponente mod primo
    public static long cuadradossucesivos(long baseg, long exponente, long modulo){

        // Resultado acumulado.
        long resultado = 1 ;

        // Reduce la base módulo p.
        baseg = baseg % modulo;

        // Recorre el exponente en binario.
        while (exponente > 0){

            // Multiplica cuando el bit actual es 1.
            if (exponente % 2 == 1){
                resultado = (resultado * baseg) % modulo;
            }

            // Eleva la base al cuadrado módulo p.
            baseg = (baseg * baseg) % modulo;//

            // Avanza al siguiente bit.
            exponente = exponente / 2;
        }

        // Devuelve base^exponente mod p.
        return resultado;
    }
}
