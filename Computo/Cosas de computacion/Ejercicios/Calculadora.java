public class Calculadora {
    
    static int mayor(int a, int b) {
        int mayor =0;
          if (a > b){
            mayor = a;
          }else {
            mayor = b;
          }   
        return mayor;
    }
    
    static void imprimirMayor(int a, int b) {
        int resultado = mayor(a, b);
        System.out.println("El mayor es: " + resultado);
    }
    
    public static void main(String[] args) {
        imprimirMayor(15, 28);
    }
}