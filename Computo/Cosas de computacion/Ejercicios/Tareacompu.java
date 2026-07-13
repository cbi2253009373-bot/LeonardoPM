import java.util.Scanner;
public class Tareacompu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;
        System.out.println("Ingresa el numero que deseas comprobar que es primp o no");
        numero = sc.nextInt();
        boolean esPrimo = true;
        if (numero <= 1){
            esPrimo = false;
        }else{
            for(int i=2; i<=Math.sqrt (numero); i++){
                if ( numero % i == 0 ) {
                    esPrimo = false ;
                    break;
                }
            }
        }

        if (esPrimo){
            System.out.println("El numero es primo");
        }else{
             System.out.println("El numero no es primo");
            }
    
    
    sc.close();    
    }
}
    
