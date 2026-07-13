public class Main {
 public static void main(String [] args){
 //Creacion de todos los objetos
 Alumno alumno1 = new Alumno("LeonardoPM", 18, "Lic. Computacion");
 Alumno alumno2 = new Alumno("SajidM", 18, "Lic. Computacion");
 Auto carro1 = new Auto("Toyota", "Corolla", 360);
 Auto carro2 = new Auto("Nissan", "Gtr34", 280);
 CuentaBancaria cuenta1 = new CuentaBancaria("LeonardoPM", 15000.0, 500.0);
 CuentaBancaria cuenta2 = new CuentaBancaria("SajidM", 26522.0, 3600.0);
 Estudiante estudiante1 = new Estudiante("LeonardoPM", "2253009373", 9.8);
 Estudiante estudiante2 = new Estudiante("SajidM", "2253009374", 5.5);
 Libro libro3 = new Libro("Don Quijote de la Mancha", "miguelito cervantes", 863);             
 //Mostrar todos los objetos todos
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(estudiante1);
    System.out.println(estudiante2);
    System.out.println(alumno1);
    System.out.println(alumno2);
    System.out.println(libro3);
    System.out.println(carro1);
    System.out.println(carro2);

 }
 
}
