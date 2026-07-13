public class Producto {
    String nombre;
    double precio;
    int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Metodos getter

    public String getNombre() {
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
    public void MostrarInfo(){
        System.out.println("Nombre: " + nombre + "| Precio: " + precio + "| Stock: " + stock);
    }
}