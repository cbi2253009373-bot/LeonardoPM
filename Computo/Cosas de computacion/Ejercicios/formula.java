import java.util.Scanner;
 public class formula{
  public static void main(String [] args){
   Scanner fm= new Scanner(System.in);
   
    double numa,numb,numc,resul1,resul2;
    double discriminante;
   
      
   System.out.println("Ingresa los numeros de los coeficientes de las variables y que no sean negativos sino positivos\n");

   System.out.println("Ingresa el numero del coeficiente A");
   numa= fm.nextDouble();
   System.out.println("Ingresa el numero del coeficiente B");
   numb= fm.nextDouble();
   System.out.println("Ingresa el numero del coeficiente C");
   numc= fm.nextDouble();
  if(numa==0){
    System.out.println("Error: El numero A es 0 y no se pueden hacer divisiones entre 0\n");
  }
   
  discriminante=(numb*numb)-(4*numa*numc);
   
  if(discriminante<0){
   System.out.println("Error: No se pueden calcular raices negativas\n");
  }else{
   resul1=((-(numb)+ Math.sqrt(discriminante))/(2*numa));
   resul2=((-(numb)- Math.sqrt(discriminante))/(2*numa));  
 
   System.out.println("La solucion 1  es \n"+resul1);
   System.out.println("La solucion 2  es \n"+resul2);
  }

   

  fm.close();



 }






}