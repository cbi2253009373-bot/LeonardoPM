import java.time.LocalDate;
public class Estudiante extends Persona {
    //Puse cuenta de ahorro como atributo porque en la clase cuenta de 
    // ahorro se encuentra el método para calcular intereses, y la profa dijo algo que debia relacionarse 
    // con la practica 2.
    // Atributos
    private CuentaAhorro cuentaAhorro;
    private String matricula;
    private double promedio;
    private LocalDate fechaIngreso;
    // Constructor
    public Estudiante(String nombre,LocalDate fechaNacimiento, String direccion, String matricula , double promedio , LocalDate fechaIngreso){
        super(nombre,fechaNacimiento,direccion);
        this.matricula = matricula;
        this.promedio = promedio;
        this.fechaIngreso = fechaIngreso;
    }
    // Métodos getters y setters
    public void setCuentaAhorro(CuentaAhorro cuentaAhorro){
        this.cuentaAhorro = cuentaAhorro;
    }
    public CuentaAhorro getCuentaAhorro() {
        return cuentaAhorro;
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
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\nFecha de ingreso: " + getFechaIngreso() + "\nDireccion: " + getDireccion() + "\nMatrícula: " + getMatricula() + "\nPromedio: " + getPromedio();
    }
}
 
