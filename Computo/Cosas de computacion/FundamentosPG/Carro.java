public class Carro {
    private String modelo;
    private double precio;
    private int kilometraje;

    // Constructor
    public Carro(String modelo, double precio, int kilometraje) {
        this.modelo = modelo;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("Modelo:   " + modelo + "      | Precio: $" + precio + "      | Kilometraje: " + kilometraje + " km");
        System.out.println("-------------------------------------------------------------");
    }
}