import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese la marca de la lavadora: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el modelo de la lavadora: ");
        String modelo = sc.nextLine();  
        System.out.println("Ingrese el precio de la lavadora: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la capacidad de la lavadora (en kg): ");
        int capacidad = sc.nextInt();  
        //sc.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el tipo de carga de la lavadora (frontal o superior): ");
        String tipoCarga = sc.nextLine();
        tipoCarga = sc.nextLine(); // Leer el tipo de carga después de limpiar el buffer
        //Objeto lacadora
        Lavorada la = new Lavorada(marca, modelo, precio, capacidad, tipoCarga);
        System.out.println("\nInformación de la lavadora:");
        la.mostrarInformacion();
        //Crear objeto electrodomestico en main
        Electrodomestico elec = new Electrodomestico("Lg","2026",8500);
        System.out.println("\nInformación del electrodoméstico:");
        elec.mostrarInformacion();




        sc.close();

    }
}
