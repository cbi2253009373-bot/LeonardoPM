import java.util.Scanner;
public class operadores{
    public static void main (String [] args){
    Scanner a= new Scanner(System.in);

    int numero1,numero2;
    System.out.println("Ingresa tu numero 1\n");
     numero1 = a.nextInt();

    System.out.println("Ingresa tu numero 2\n");
     numero2 = a.nextInt();

        if(numero1==numero2){
       System.out.println("Tus numeros son iguales\n");
    
       }else{
       if(numero1>numero2 ){
        System.out.println("Numero 1 es mayor que numero2\n");
        }else{
        System.out.println("Numero 2 es mayor que numero1\n");
          }
      }
      a.close();
  }
 
}
