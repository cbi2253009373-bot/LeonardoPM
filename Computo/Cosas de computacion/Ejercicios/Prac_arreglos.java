import java.util.Scanner;
 public class Prac_arreglos{
  public static void main (String [] args) {
   Scanner sc= new Scanner (System.in);

   double  Prom_gen , calif_final;
    int No_studens;
do{
 System.out.println("Ingresa las calificaciones\n");
 calif_final= sc.nextDouble();
}while(calif_final<0.0 && calif_final>10.0);
do{
 System.out.println("Ingresa el numero de estudiantes\n");
 No_studens= sc.nextInt();
}while(No_studens<5 && No_studens>40);

Prom_gen=(calif_final/No_studens);
System.out.println("Tus calificaciones son "+calif_final);
System.out.println("La cantidad de tus es tu diantes son "+No_studens);
System.out.println("El promedio de tu grupo es"+Prom_gen);




 








sc.close();
 


}





















}
