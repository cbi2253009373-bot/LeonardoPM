//Algoritmo de cuadrados sucesivos
import java.util.Scanner;
public class cuadradossucecivos{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        long base, exponente, modulo, resultado,baseOriginal, expOriginal;
        System.out.println("Ingresa tu base");
        base = sc.nextLong();
        System.out.println("Ingresa tu exponente");
        exponente = sc.nextLong();
        System.out.println("Ingresa tu modulo");
        modulo = sc.nextLong();
        baseOriginal = base;
        expOriginal = exponente;
        resultado = 1;
        base = base%modulo;
        while(exponente>0){  
            if(exponente%2 == 1){
                resultado = (resultado*base)%modulo;
            }
            base = (base*base)%modulo;
            exponente=exponente/2;
        }
        System.out.println(baseOriginal+"^"+expOriginal+" mod "+modulo+" = "+resultado);
    }
}