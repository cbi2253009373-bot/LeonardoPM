import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Producto [] pro = new Producto[5];
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            for(int i= 0; i < pro.length; i++){
            System.out.println("Ingresa el nombre del producto: "+(i+1));
            String nombre = sc.nextLine();
            System.out.println("Ingresa el precio del producto: "+(i+1));
            double precio = sc.nextDouble();
            System.out.println("Ingresa el stock del producto: "+(i+1));
            int stock = sc.nextInt();
            sc.nextLine();
            pro[i] = new Producto(nombre, precio, stock);
           }
           System.out.println("***************Menu***********************");
           System.out.println("1.Ordenar por nombre de prodcuto (A-z) ");
           System.out.println("2.Ordenar por precio del producto (Mayor a menor) ");
           System.out.println("3.Ordenar por stock del producto (Menor a mayor)  ");
           System.out.println("4.Saber toda la informacion de los productos ");
           System.out.println("5.Salir");
           System.out.println("Ingresa tu opcion que deseas: ");
           opcion = sc.nextInt();
           switch (opcion) {
                case 1:OrdenarNombre(pro);
                break;
                case 2 :OrdenarPrecio(pro);
                break;
                case 3:OrdenarStock(pro);
                break;
                case 4:MostrarInfo(pro);
                break;
                default:System.out.println("Opcion no valida, por favor ingresa una opcion del menu");
                break;
           }
        } while (opcion != 5);

    }
    public static void OrdenarNombre(Producto [] pro){
        for(int i = 0; i < pro.length - 1; i++){
            for(int j = 0; j < pro.length - i - 1; j++){
                if(pro[j].getNombre().compareTo(pro[j+1].getNombre()) > 0){
                    Producto temp = pro[j];
                    pro[j] = pro[j+1];
                    pro[j+1] = temp;
                }
            }
        }
        System.out.println("Productos ordenados por nombre (A-z): ");
        for(Producto p : pro){
            p.MostrarInfo();
        }
    }
    public static void OrdenarPrecio(Producto [] pro){
        for(int i = 0; i < pro.length - 1; i++){
            for(int j = 0; j < pro.length - i - 1; j++){
                if(pro[j].getPrecio() < pro[j+1].getPrecio()){
                    Producto temp = pro[j];
                    pro[j] = pro[j+1];
                    pro[j+1] = temp;
                }
            }
        }
        System.out.println("Productos ordenados por precio (Mayor a menor): ");
        for(Producto p : pro){
            p.MostrarInfo();
        }
    }
    public static void OrdenarStock(Producto [] pro){
        for(int i = 0; i < pro.length - 1; i++){
            for(int j = 0; j < pro.length - i - 1; j++){
                if(pro[j].getStock() > pro[j+1].getStock()){
                    Producto temp = pro[j];
                    pro[j] = pro[j+1];
                    pro[j+1] = temp;
                }
            }
        }
        System.out.println("Productos ordenados por stock (Menor a mayor): ");
        for(Producto p : pro){
            p.MostrarInfo();
        }
    }
    public static void MostrarInfo(Producto [] pro){
        for(Producto p : pro){
            p.MostrarInfo();
        }
    }
   
}
