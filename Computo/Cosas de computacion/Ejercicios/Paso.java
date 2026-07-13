public class Paso {
    public static double promedio( double x, double y, double z) {
       double promedio =0;
       promedio = (x +y+x)/3;
     return promedio;
    }
     public static void main(String[] args) {
      double p = promedio(8.5, 9.0, 7.5);
     System.out.println("Promedio: " + p);
    }
}

