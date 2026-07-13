import java.time.LocalDate;
public class EstudianteDoctorado extends Estudiante {
  private String programa;
  private String temaTesis;
  private String directorTesis;
    public EstudianteDoctorado(String nombre, LocalDate fechaNacimiento, String direccion, String matricula, double promedio, LocalDate fechaIngreso, String programa, String temaTesis, String directorTesis){
        super(nombre, fechaNacimiento, direccion, matricula, promedio, fechaIngreso);
        this.programa = programa;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
    }
    public void setPrograma(String programa){
        this.programa = programa;   
    }
    public String getPrograma(){
        return programa;
    }
    public void setTemaTesis(String temaTesis){
        this.temaTesis = temaTesis;
    }
    public String getTemaTesis(){
        return temaTesis;
    }
    public void setDirectorTesis(String directorTesis){
        this.directorTesis = directorTesis;
    }
    public String getDirectorTesis(){
        return directorTesis;
    }
    public void realizarTesis(String temaTesis, String directorTesis){
        System.out.println("Has realizado tu tesis: " + getTemaTesis()+" Director: "+ getDirectorTesis());
    }
    public void publicarArticulo(String temaTesis, String programa){
        System.out.println("Has publicado un articulo sobre tu tesis: " + getTemaTesis()+ "Tu programa es: " + getPrograma());
    }
    
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\nDireccion: " + super.getDireccion() + "\nMatrícula: " + super.getMatricula() + "\nPromedio: " + getPromedio() + "\nFecha de ingreso: " + getFechaIngreso() + "\nPrograma: " + getPrograma() + "\nTema de tesis: " + getTemaTesis() + "\nDirector de tesis: " + getDirectorTesis();
    }
}
