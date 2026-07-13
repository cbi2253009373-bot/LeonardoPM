import java.util.Scanner;
public class Propietario {
    public static void main (String  [] args){
      Scanner sc = new Scanner (System.in);
      String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";
      char [] letras = alfabeto.toCharArray();
      int [] valores = new int[letras.length];

      for (int i = 0; i < valores.length; i++) {
          valores[i] = i + 11;
      }

      long primo, exponente, g,a;
      System.out.println("Ingrese un numero primo: ");
      primo = sc.nextLong();
      System.out.println("Ingrese el exponente: ");
      exponente = sc.nextLong();
      System.out.println("Ingrese el generador: ");
      g = sc.nextLong();
      a = cuadradossucesivos(g, exponente, primo);
      System.out.println("El valor de a es: " + a);
      System.out.println("El valor de g es: "+ g);
      System.out.println("El valor del primo es: "+ primo);

     System.out.println("Ingresa tu gama");
     int gama = sc.nextInt();
     System.out.println("Ingresa tus bloques");
     String bloquesbeta = sc.nextLine();
     bloquesbeta = sc.nextLine().trim();
        String[] bloques = bloquesbeta.split("\\s+");
     System.out.println("mensaje cifrado: ");
     for (int i = 0; i < bloques.length; i++) {

    long bloque = Long.parseLong(bloques[i]);

    long bloqueOriginal =
        (bloque * gama) % primo;

    boolean encontrado = false;

    for (int j = 0; j < valores.length; j++) {
        if (bloqueOriginal == valores[j]) {
            System.out.print(letras[j]);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.print("[?]");
    }
}




    System.out.println();
    sc.close();

    }

    //metodo de aritmetica modular para calcular a = g^exponente mod primo
    public static long cuadradossucesivos(long baseg, long exponente, long modulo){
        long resultado = 1 ;
        baseg = baseg % modulo;

        while (exponente > 0){
            if (exponente % 2 == 1){
                resultado = (resultado * baseg) % modulo; 
            }
            baseg = (baseg * baseg) % modulo;//
            exponente = exponente / 2; 
        }
        return resultado;
    }
}
