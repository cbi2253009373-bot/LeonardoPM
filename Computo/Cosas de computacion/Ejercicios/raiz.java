import java.util.Scanner;
 public class raiz{
  public static void main (String [] args){
   Scanner a= new Scanner (System.in);
   float numa,numb,numc,resultado;
   double variable;
    System.out.println("Ingresa los numeros de los coeficientes de las variables y que no sean negartivos sino positivos\n");
    do {
      System.out.println("Ingresa el numero del coeficiente A\n");
     numa= a.nextFloat();
    }while(numa==0);
    do {
      System.out.println("Ingresa el numero del coeficiente B\n");
     numb =a.nextFloat();
    } while (numb==0);
    
    System.out.println("Ingrese el numero del coeficiente C\n");
    numc=a.nextFloat();
    while (numc==0) {
     System.out.println("Error no se pueden hacer divisiones entre cero intente de nuevo\n");
     numc=a.nextFloat();
    }
    variable=0;
    if (numb>=0) {
      variable= Math.sqrt(numb);
    }else{
     System.out.println("Nose puede hacer raiz cuadrada de un numero negativo\n");
    }
    resultado=(numa/numc);
  
    System.out.println("Tu la division de "+numa+" entre "+numb+" es "+resultado);
    System.out.println("La raiz cuadrada de "+numb+ " Es "+variable);


    
     
     
      
    
    
    
    
    

    



   a.close();
  }















}
