import java.util.Scanner;
public class ls{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double metros, pies, conversionMetrosAPies, conversionPiesAMetros;
        System.out.println("Programa para convertir metros a pies y pies a metros.");
        System.out.println("Los valores deben ser mayores que cero.\n");
        // ---- PIES A METROS ----
        do {
            System.out.print("Ingresa la medida en pies que deseas convertir a metros: ");
            pies = sc.nextDouble();

            if (pies <= 0) {
                System.out.println("Error: el valor debe ser mayor que cero.\n");
            }

        } while (pies <= 0);

        // ---- METROS A PIES ----
        do {
            System.out.print("Ingresa la medida en metros que deseas convertir a pies: ");
            metros = sc.nextDouble();

            if (metros <= 0) {
                System.out.println("Error: el valor debe ser mayor que cero.\n");
            }

        } while (metros <= 0);

        // Conversiones
        conversionMetrosAPies = metros * 3.28084;
        conversionPiesAMetros = pies * 0.3048;

        // Resultados
        System.out.println("\nResultado:");
        System.out.println("Metros a pies: " + conversionMetrosAPies);
        System.out.println("Pies a metros: " + conversionPiesAMetros);

        sc.close();
    }
}