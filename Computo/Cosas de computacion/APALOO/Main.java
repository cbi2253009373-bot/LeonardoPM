public class Main {
 public static void main(String [] args){
 //Creacion de todos los objetos
 Alumno alumno1 = new Alumno("LeonardoPM", 18, "Lic. Computacion");
 Alumno alumno2 = new Alumno("Sajid M", 18, "Lic. Computacion");
 Auto carro1 = new Auto("Toyota", "Corolla", 360);
 Auto carro2 = new Auto("Nissan", "Gtr34", 280);
 CuentaBancaria cuenta1 = new CuentaBancaria("LeonardoPM", 15000.0);
 CuentaBancaria cuenta2 = new CuentaBancaria("SajidM", 25000.0);
 Estudiante estudiante1 = new Estudiante("LeonardoPM", "2253009373", 9.8);
 Estudiante estudiante2 = new Estudiante("SajidM", "2253009374", 5.5);
 Libro libro3 = new Libro("Don Quijote de la Manchas", "miguelito cervantes", 863);
 Libro libro4 = new Libro("El fin del mundo", "Capitan Jack Sparrow", 96);
 //Mostrar todos los objetos todos
 //meotods libro
   System.out.println(libro3);
   libro4.mostrar();
   //Automovil
   carro1.acelerar(50);
   carro1.mostrarInformacion();
   carro2.frenar(30);
   carro2.mostrarInformacion();
   //Estudiante
   estudiante1.mostrarInformacion();
   estudiante2.mostrarInformacion();
   //cuenta 2
   cuenta1.Depositar(5000);
   cuenta1.mostrarInformacion();
   //cuenta 1
   cuenta2.Retirar(23000);
   cuenta2.mostrarInformacion();
   //alumno
   alumno1.mostrarInformacion();
   System.out.println(alumno2);
   
   

 }
 
}
