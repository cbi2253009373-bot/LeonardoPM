public class Practiamtriz {
public static void main(String[] args) {
        // datos
        int datos[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sumatotal = 0;

        imprimirmatriz(datos);

        sumatotal = Suma(datos);
        System.out.println("Suma total: " + sumatotal);

        System.out.println("Matriz duplicada:");
        duplicado(datos);

        int mayor = buscarMayor(datos);
        System.out.println("Tu mayor es: " + mayor);

        // suma de matrices
        int [][] x = {{1,2,3}, {4,5,6}};
        int [][] y = {{7,8,9}, {1,2,3}};

        int [][] sumatotalmatriz = SumarMatrices(x, y);

        System.out.println("Suma de matrices:");
        imprimirmatriz(sumatotalmatriz);
    }

    // Imprimir matriz
    public static void imprimirmatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d]", m[i][j]);
            }
            System.out.println();
        }
    }

    // Suma de todos los elementos
    public static int Suma(int [][] m) {
        int suma = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma = suma + m[i][j];
            }
        }

        return suma;
    }

    // Duplicar matriz
    public static void duplicado(int [][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = m[i][j] * 2;
                System.out.printf("[%d]", m[i][j]);
            }
            System.out.println();
        }
    }

    // Buscar mayor
    public static int buscarMayor(int [][] m) {
        int maximo = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maximo) {
                    maximo = m[i][j];
                }
            }
        }

        return maximo;
    }

    // Suma de matrices
    public static int[][] SumarMatrices(int [][] a, int [][] b) {
        int [][] resultado = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }

        return resultado;
    }
}

    

    

