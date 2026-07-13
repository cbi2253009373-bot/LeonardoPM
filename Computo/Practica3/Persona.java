import java.time.LocalDate;
public class Persona{
   private String nombre;
   private LocalDate fechaNacimiento;
   private String direccion;
   public Persona(String nombre, LocalDate fechaNacimiento, String direccion ){
     this.nombre = nombre;
     this.fechaNacimiento = fechaNacimiento;
     this.direccion = direccion;
   }
  
   public void setNombre (String nombre){
    this.nombre = nombre;
   }
   public String getNombre(){
     return nombre;
   }
    public void setFechaNacimiento(LocalDate fechaNacimiento){
      this.fechaNacimiento = fechaNacimiento;
    }
    public LocalDate getFechaNacimiento(){
    return fechaNacimiento;
    }
    public void setDireccion(String direccion){
      this.direccion = direccion;
    }
    public String getDireccion(){
      return direccion;
    }
    public void AdultoMayor ( ){
      LocalDate fechaactual = LocalDate.now();
      int actual;
          actual = (fechaactual.getYear() - this.fechaNacimiento.getYear());
      if (actual >= 60 ){
        System.out.println("Tienes 60 años o mas");
      }
    }
    public int obtenerEdad (){
      LocalDate actual1 = LocalDate.now();
     int edad;
     edad = (actual1.getYear() - this.fechaNacimiento.getYear());
     return edad;
    }
    @Override
    public String toString(){
      return "Nombre: " + getNombre() + "\nFecha de nacimiento: " + getFechaNacimiento() + "\nDireccion: " + getDireccion();
    }




}