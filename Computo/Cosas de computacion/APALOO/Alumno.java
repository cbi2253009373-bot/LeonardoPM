public class Alumno{
//atributos
  private String nombre;
  private int edad;
  private String carrera;
//constructor
 public Alumno(String nombre , int edad , String carrera){
  this.nombre = nombre ;
  this.edad = edad ;
  this.carrera = carrera;
  }
//geter y seter
 public void setNombre(String nombre){
  this.nombre = nombre;
 }
 public String getNombre(){
 return this.nombre;
 }
 public void setEdad(int edad ){
  this.edad = edad;
 }
 public int getEdad(){
 return this.edad;
 }
 public void setCarrera(String carrera){
 this.carrera = carrera;
 }
 public String getCarrera(){
  return this.carrera;
 }
//acabamos setyy get
 //meotods anios 
  public void cumplirAnios(int edad){
   this.edad = (edad + 1);
   System.out.println("Ahora tienes " + this.edad + " años");
  }
  public void mostrarInformacion(){
   System.out.println("******Informacion del alumno******");
   System.out.println(" Nombre: "+ nombre);
   System.out.println("   Edad: "+ edad);
   cumplirAnios(edad);
   System.out.println("Carrera: "+ carrera);
   System.out.println("***********************************");
 }
 //metodo para mostrar informacion del alumno
 public String toString(){
  return "**********Informacion del alumno************** "+
         "\n Nombre: " + nombre + 
        "\n    Edad: " + edad + 
        "\n Carrera: " + carrera+
        "\n***********************************";
 }















}
