public class Electrodomestico {
    //atributos
    private String marca;
    private String modelo;
    private double precio;
    //constructor
    public Electrodomestico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;


    }
    //metodo para mostrar la informacion del electrodomestico
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
    }

}
