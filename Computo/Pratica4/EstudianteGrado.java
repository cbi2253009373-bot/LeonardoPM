import java.time.LocalDate;
public class EstudianteGrado extends Estudiante {
    private String titulacion;
    private int creditos;
    private boolean servicioSocial;
    public EstudianteGrado (String nombre, LocalDate fechaNacimiento, String direccion, String matricula, double promedio, LocalDate fechaIngreso, String titulacion, int creditos, boolean servicioSocial){
        super(nombre, fechaNacimiento, direccion, matricula, promedio, fechaIngreso);
        this.titulacion = titulacion;
        this.creditos = creditos;
        this.servicioSocial = servicioSocial;
    }
    public void setTitulacion(String titulacion){
        this.titulacion = titulacion;
    }
    public String getTitulacion(){
        return titulacion;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    public int getCreditos(){
        return creditos;
    }
    public void setServicioSocial(boolean servicioSocial){
        this.servicioSocial = servicioSocial;
    }
    public boolean getServicioSocial(){
        return servicioSocial;
    }
    public void realizarProyecto(){
        System.out.println("Has realizado tu proyecto de titulación: " + getTitulacion());
    }
    public void solicitarTitulacion(){
        if (getServicioSocial() == true && getCreditos() >= 300) {
            System.out.println("Felicidades, has cumplido con los requisitos para solicitar tu titulación");
        } else {
            if (getServicioSocial() == false && getCreditos() >= 300){
                System.out.println("Lo siento, no has cumplido con los requisitos para solicitar tu titulación porque no has realizado tu servicio social");
            } else {
                if (getServicioSocial() == true && getCreditos() < 300){
                    System.out.println("Lo siento, no has cumplido con los requisitos para solicitar tu titulación porque no has cumplido con los créditos necesarios"+"Tienes: "+getCreditos()+" créditos, te faltan: "+(300-getCreditos())+" créditos");
                } 
            }
        }
    }
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "\n Matrícula: " + getMatricula() + "\nTitulación: " + getTitulacion() + "\nCréditos: " + getCreditos() + "\nServicio Social: " + getServicioSocial(); 
    }       
}
