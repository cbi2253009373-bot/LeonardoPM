public class Pasoparametros{
public static void saludar(String nombre, int veces) {
for (int i = 0; i < veces; i++) {
System.out.println("Hola, " + nombre + "!");
}
}
public static void main(String[] args) {
saludar("Ana", 3);
saludar("Luis", 1);
}

}

