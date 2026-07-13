public class Persona{
 String nombre;
 public Persona(String nombre ){
  this.nombre = nombre;
  }
public static void main (String [] args ){
  Persona p1 = new Persona("Juan");
  Persona p2 = new Persona("Juan");
 System.out.println(p1.equals(p2));

 }
 public boolean equals (Object obj){
 // Verifica si el objeto recibido es null.
 // Si es null, no puede ser igual al objeto actual.
 if(obj == null){
 return false;
}
 // Verifica que el objeto recibido sea de tipo Persona.
 // Si pertenece a otra clase, no son comparables.
 if(!(obj instanceof Persona)){
 return false;
}
 // Convierte (casting) el objeto genérico Object
 // a un objeto de tipo Persona para poder acceder a sus atributos.
 Persona otra = (Persona) obj;
 // Compara el atributo nombre de ambos objetos.
 // Se utiliza equals() porque nombre es un String.
 // Regresa true si los nombres son iguales y false en caso contrario.
 return this.nombre.equals(otra.nombre);
  






  }













 }
