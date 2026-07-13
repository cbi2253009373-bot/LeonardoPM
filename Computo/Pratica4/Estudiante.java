import java.time.LocalDate;
public class Estudiante extends Persona implements Comparable<Estudiante>{
    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;
    public Estudiante(String nombre,LocalDate fechaNacimiento, String direccion, String matricula , double promedio , LocalDate fechaIngreso){
        super(nombre,fechaNacimiento,direccion);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaIngreso = fechaIngreso;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
    public double getPromedio(){
        return promedio;
    }
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
    public void incribirMateria(String materia){
        System.out.println("Te has inscrito a la materia: " + materia);
    } 
    public double calcularBeca(){
        if (getPromedio() >= 9.0){
            System.out.println("Felicidades, has obtenido una beca de 3000 pesos");
            return 3000;
        } else {
            if (getPromedio() >= 8.0){
            System.out.println("Felicidades, has obtenido una beca de 2000 pesos");
            return 2000;
            }else {
               System.out.println("Felicidades, has obtenido una beca de 1000 pesos");
               return 1000;
            }
        }
    }    
   //metodo de comparar los dos objetos de estudiante
   @Override
   public int compareTo(Estudiante otro) {
       return this.matricula.compareTo(otro.matricula);
   }
   @Override
   public boolean equals(Object obj){
     if (obj == null){
     return false;
     }
     if (!(obj instanceof Estudiante)){
     return false;
     }
     Estudiante otro = (Estudiante) obj;
     return this.matricula.equals(otro.matricula);
    }
    
   @Override
   public String toString(){
        return "Nombre: " + getNombre() + "\nFecha de ingreso: " + getFechaIngreso() + "\nDireccion: " + getDireccion() + "\nMatrícula: " + getMatricula() + "\nPromedio: " + getPromedio();
    }
}

