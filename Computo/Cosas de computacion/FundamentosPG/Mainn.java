import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos carros deseas ingresar? ");
        int n = sc.nextInt();

        Carro [] lista = new Carro[n];

        // 🔹 INGRESO DE DATOS
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa los datos del carro " + (i + 1));

            System.out.print("Modelo: ");
            String modelo = sc.next();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Kilometraje: ");
            int km = sc.nextInt();

            lista[i] = new Carro(modelo, precio, km);
        }

        int opcion;

        // 🔹 MENÚ
        do {
            System.out.println("\n---- CATÁLOGO DE CARROS ----");
            System.out.println("1. Ordenar por modelo (A-Z)");
            System.out.println("2. Ordenar por precio (menor a mayor)");
            System.out.println("3. Ordenar por kilometraje (mayor a menor)");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    ordenarPorModelo(lista);
                    mostrarLista(lista);
                    break;

                case 2:
                    ordenarPorPrecio(lista);
                    mostrarLista(lista);
                    break;

                case 3:
                    ordenarPorKilometraje(lista);
                    mostrarLista(lista);
                    break;

                case 4:
                    mostrarLista(lista);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }

    // 🔹 MOSTRAR
    public static void mostrarLista(Carro[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i].mostrar();
        }
    }

    // 🔹 ORDENAR POR MODELO (A-Z)
    public static void ordenarPorModelo(Carro[] lista) {
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                String a = lista[j].getModelo();
                String b = lista[j + 1].getModelo();

                if (a.compareTo(b) > 0) {
                    Carro temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    // 🔹 ORDENAR POR PRECIO (MENOR A MAYOR)
    public static void ordenarPorPrecio(Carro[] lista) {
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (lista[j].getPrecio() > lista[j + 1].getPrecio()) {
                    Carro temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }

    // 🔹 ORDENAR POR KILOMETRAJE (MAYOR A MENOR)
    public static void ordenarPorKilometraje(Carro[] lista) {
        int n = lista.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (lista[j].getKilometraje() < lista[j + 1].getKilometraje()) {
                    Carro temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
    }
}