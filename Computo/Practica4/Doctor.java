public class Doctor{
    private String especialidad;
    private String universidad;
    private int anioObtencion;
    public Doctor(String especialidad, String universidad, int anioObtencion){
        
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.anioObtencion = anioObtencion;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setUniversidad(String universidad){
        this.universidad = universidad;
    }
    public String getUniversidad(){
        return universidad;
    }
    public void setAnioObtencion(int anioObtencion){
        this.anioObtencion = anioObtencion;
    }
    public int getAnioObtencion(){
        return anioObtencion;
    }
    public boolean validarTitulo(){
        if (anioObtencion > 0){
            return true;
        } else {
            return false;
        }
    }

    public void registrarTitulo(){
        if (validarTitulo()){
            System.out.println("Felicidades, has registrado tu titulo de doctor en " + getEspecialidad() + " por la universidad " + getUniversidad());
        } else {
            System.out.println("Lo siento, no has registrado tu titulo de doctor");
        }
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Doctor)){
            return false;
        }
        Doctor other = (Doctor) obj;
        return especialidad.equals(other.especialidad) && universidad.equals(other.universidad) && anioObtencion == other.anioObtencion;
    }
    @Override
    public String toString(){
        return "Doctor en: " + getEspecialidad() 
        +"\npor la universidad " + getUniversidad() 
        +"\nobtenido en el año " + getAnioObtencion();
    }

}
