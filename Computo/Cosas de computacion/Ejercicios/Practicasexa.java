import java.util.Scanner;
public class Practicasexa {
  public static void main (String [] args ){
     Scanner sc= new Scanner (System.in);
     char [] inicial = new char [60];
     int i = 0;
      System.out.println("Ingresa la inicial de tus alumnos");
     do{
     System.out.println("Estudiante "+(i+1));
     inicial[i]=sc.next().charAt(0);
     i++; 
     }while (i<inicial.length);
     
     for(int j=0; j<inicial.length; j++){
     System.out.println("Las inciales de tus alumnos son"+inicial[j]);
     }    
    


     sc.close(); 
    } 
    












 
}