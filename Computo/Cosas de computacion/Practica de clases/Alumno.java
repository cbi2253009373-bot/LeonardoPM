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
  public void cumplirAnios(){
   this.edad = (edad + 1);
  }
  public void mostrarInformacion(){
   System.out.println("Nombre: "+nombre);
   System.out.println("Edad: "+edad);
   System.out.println("Carrera: "+carrera);
  }
//metodo tostring
 @Override
 public String toString(){
   return "Nombre: " + nombre +
        "\n  Edad: " + edad +
      "\n Carrera: " + carrera;
 }















}
