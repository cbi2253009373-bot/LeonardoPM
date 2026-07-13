import java.util.Scanner;
 public class Practica2{
  //inicia metodo principal
 public static void main (String [] args){
   Scanner sc = new Scanner (System.in);
  int [] numeros = new int [6];
  int opcion;
  for(int i = 0 ; i < numeros.lenght ;i++){
  System.out.println("Numero: "+(i+1));
   numeros [i] = sc.nextInt();
  }
  do{
  System.out.println("Ingresa la opcion que deseas: ")
  System.out.println("1.Contar Pares");
  System.out.ptintln("2.Contar impares");
  System.out.println("3.Invertir arreglo");
  System.out.println("4.Encontar el menor");
  System.out.println("5.Salir");
  opcion = sc.nextInt();

  switch{
     case 1:Pares(numeros):
      break;
     case 2:Impares(numeros):
      break:
     case 3:Inverso(numeros):
      break:
     case 4:Menor(numeros):
      break:
     case 5:System.out.println("Gracias por visitarnos"):
      break:
   default:System.out.println("Error: Opcion Invalida ");
         }
  }while(opcion != 6)
 }
  //Termina metodo principal
  //Inician metodos secundarios
  public static void Pares(int [] numer){






  }



























}
