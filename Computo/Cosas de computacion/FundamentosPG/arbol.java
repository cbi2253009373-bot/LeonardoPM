import java.util.Scanner;
 public class arbol{
  public static void main(String [] args ){
   Scanner sc =  new Scanner (System.in);
   int altura, alturatronco, ancho;
   float centro, anchotronco;

   System.out.println("Dime de que altura quieres tu arbol");
   altura = sc.nextInt();

   System.out.println("Ingresa la altura de tu tronco");
   alturatronco = sc.nextInt();

   ancho = ((2*altura)-1);

   for (int i = 0; i < (altura-1) ; i++ ){
     for (int j = 0; j < (altura-1-i) ; j++){
     System.out.print(" ");
      }
     for(int j = 0; j < ((2*i-1)-1); j++){
       if (j % 2 == 0 ){
       System.out.print(" ");
       }else{
        System.out.print("O");
       }
     }
    System.out.println();

    }

  anchotronco = (int)(altura/2);
  if (anchotronco<1){
   anchotronco = 1;
   }

   centro = ((ancho-anchotronco)/2);

   for (int i = 0 ; i < (alturatronco) ;i++){
    for(int j = 0 ; j < (centro-1) ;j++){
      System.out.print(" ");
     }
    for(int j = 0 ; j < (anchotronco-1) ;j++){
     System.out.println("|");
      }
    System.out.println();
    }
  sc.close();
 }
}
