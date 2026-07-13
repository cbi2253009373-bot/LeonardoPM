public class Practicamatriz {
 
    public static void main(String[] args) {
        int datos [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sumatotal =0;
        imprimirMatriz(datos);
        sumatotal = Suma(datos);
        System.out.println("La suma total es: "+sumatotal);
        duplicar(datos);
        int mayor = buscarMayor(datos);
        System.out.println("El numero mayor es: "+mayor);
        //suma de matrices
        int [][]x={{1,2,3,},{4,5,6}};
        int [][]y={{7,8,9},{1,2,3}};
        int [][]sumatotalmatriz = sumaMatrices(x,y);
        System.out.println("La suma de las matrices es: "+sumatotalmatriz);


    }
   public static void imprimirMatriz(int matriz[][]){
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               System.out.printf(" [%d] ",matriz[i][j]);
           }
           System.out.printf("\n");
       }
   }
   
    //suma
    public static int Suma(int matriz[][]){
        int sumatotal =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumatotal =sumatotal+ matriz[i][j];
            }
        }
        return sumatotal;
    }
    //duplicar
    public static void duplicar(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matriz[i][j]*2;
                System.out.printf(" [%d] ", matriz[i][j] );
            }
        }
    System.out.printf("\n");
    }
    //buscar mayor
    public static int buscarMayor(int [][]m){
        int mayor = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j]>mayor){
                    mayor = m[i][j];
                }
            }
        }
        return mayor;
    }
    //suma de matrices
    public static int[][] sumaMatrices(int [][]x, int [][]y){
        int filas = x.length;
        int columnas = x[0].length;
        int [][]sumatotalmatriz = new int [filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumatotalmatriz[i][j] = x[i][j]+y[i][j];
            }
        }
        return sumatotalmatriz;
    }



}