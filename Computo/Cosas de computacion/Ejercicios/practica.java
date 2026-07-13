import java.util.Scanner;

 public class practica{

 public static void main (String [] args){
Scanner a= new Scanner(System.in);

int numero1,numero2;
System.out.println("Ingresa tu numero 1\n");
numero1 = a.nextInt();

System.out.println("Ingresa tu numero 2\n");
numero2 = a.nextInt();

if(numero1==numero2){
System.out.println(numero1+" Es igual que "+numero2);
    
 }else{
     if(numero1>numero2 ){
        System.out.println(numero1+" Es mayor que "+numero2);
        }else{
       System.out.println(numero2+" Es mayor que "+numero1);
          }
       }
a.close();
  }

}
