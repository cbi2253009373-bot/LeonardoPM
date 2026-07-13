import java.util.Scanner;

public class leon {

    public static void main(String[] args) {
        String nombre;
        int edad;
        float peso,imc;
        float altura;
        System.out.println("Hola mundo de introduccion a la computacion\n");

        Scanner a= new Scanner(System.in);
        System.out.println("Ingresa tu nombre\n");
        nombre= a.nextLine();

        System.out.println("Ingresa tu edad\n");
        edad= a.nextInt();
        System.out.println("Ingresa tu peso");
        peso= a.nextFloat();
        System.out.println("Ingresa tu altunra en metros");
        altura= a.nextFloat();
        imc= peso/(altura*altura);

        System.out.println(" Tu nombre es "+nombre+" Tu edad es "+edad+" Tu peso es "+peso+" Tu altura es "+altura+"Tu imc es de "+imc);

        a.close();
    }
}