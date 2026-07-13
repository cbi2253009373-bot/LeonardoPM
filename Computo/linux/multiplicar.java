import java.util.Scanner;
public class multiplicar{
  public static void main (String [] args){
   int b;
   int a;
   Scanner sc = new Scanner(System.in);
  System.out.println("Ingresa tu numero: ");
   a = sc.nextInt();
  System.out.println("Ingresa el numero que deseas terminar");
  b= sc.nextInt();
  int acum = 0;
  for (int i = 0 ; i < b ; i++){
     acum = (a*(i+1));
     System.out.println(a+" x "+(i+1)+" = "+acum);
    }




  }









  }
