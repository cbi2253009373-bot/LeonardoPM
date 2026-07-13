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
     sc.nextLine(); // limpiar el Enter
     String bloquesbeta = sc.nextLine();
     String[] bloques = bloquesbeta.split(" ");//separar los bloques con el espacio
     long exponentecalculado = primo - 1 - exponente;
     //calcular gama-e = gamap-1-e mod primo
     long gamadescifrada = cuadradossucesivos(gama,exponentecalculado,primo);
     //calcular los bloques
     //pasar los bloques a letras
        for (int i = 0; i < bloques.length; i++) {
            long bloque = Long.parseLong(bloques[i]);
            long bloqueoriginal = (bloque * gamadescifrada) % primo;
            for (int j = 0; j < valores.length; j++) {
                if (bloqueoriginal == valores[j]) {
                    System.out.print(letras[j]);
                }
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
