public class Lavorada extends Electrodomestico {
    //atributos
    private int capacidad;
    private String tipoCarga;
    //constructor
    public Lavorada(String marca, String modelo, double precio, int capacidad, String tipoCarga) {
        super(marca, modelo, precio);
        this.capacidad = capacidad;
        this.tipoCarga = tipoCarga;
    }
    //metodo para mostrar la informacion de la lavadora
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad: "+capacidad+" kg");
        System.out.println("Tipo de carga: "+tipoCarga);
    }
    
}
