import java.util.Scanner;
public class RSApublico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = 3;
        int fi = 20;
        int m = 33; //p*q
        //encontrar u
        int u = 0;
        //pasamos a ecuacion diofantica
        for (int i = 0; i < fi-1; i++) { 
            if ((e * i) % fi == 1) {
                u = i;
                System.out.println("El valor de u es: " + u);
            }
        }
        //recuperar los bloques de texto
        System.out.print("Ingrese el mensaje cifrado: ");
        String bloque = sc.nextLine();
        String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ abcdefghijklmnñopqrstuvwxyz";
        String[] bloques = bloque.split(" ");//para que sirve el split? 
        //split sirve para separar el mensaje cifrado en bloques de texto, cada bloque separado por un espacio
        

       String numeros = "";

     for (int j = 0; j < bloques.length; j++) {//recorrer los bloques de nuneros

     int c = Integer.parseInt(bloques[j]);//convertir el bloque de texto a numero entero
     int g = 1;

     for (int i = 0; i < u; i++) {//recorrer el bloque de texto u veces
        g = (g * c) % m;//calcular el valor de g = c^u mod m
     }

     numeros += g;//concatenar el valor de g a la cadena numerica
    }

    System.out.println("Cadena numerica recuperada: " + numeros);

    System.out.print("Mensaje descifrado: ");

    for (int i = 0; i < numeros.length(); i += 2) {//recorrer la cadena numerica de 2 en 2
    int codigo = Integer.parseInt(numeros.substring(i, i + 2));//convertir el bloque de texto a numero entero
    int posicion = codigo - 11;

    char letra = alfabeto.charAt(posicion);//obtener la letra correspondiente al codigo
    System.out.print(letra);
    }
     System.out.println();
    sc.close();
    }
}
