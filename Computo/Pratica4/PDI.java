public class PDI {
    String categoria;
    String especialidad;
    int horasDocencia;

    public PDI(String categoria , String especialidad , int horasDocencia){  
      this.categoria = categoria;
      this.especialidad = especialidad;
      this.horasDocencia = horasDocencia;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setHorasDocencia(int horasDocencia){
        this.horasDocencia = horasDocencia;
    }
    public int getHorasDocencia(){
        return horasDocencia;
    }
    public String investigar(String tema){
        return "El tema de investigacion es:"+tema;
    } 
    public void impartirClase(String tema){
        System.out.println("El tema de la clase es: "+tema+"  impartio: "+horasDocencia+" horas de docencia");
    }
   //metodo del equals
   @Override
   public boolean equals(Object obj){
    if (obj == null) {
        return false;
    }
     if (!(obj instanceof PDI)) {
        return false;
     }
     PDI otro = (PDI) obj;
     return this.categoria.equals(otro.categoria) && this.especialidad.equals(otro.especialidad) && this.horasDocencia == otro.horasDocencia;
   }

    @Override
    public String toString(){
        return "Categoria: " + getCategoria() + "\nEspecialidad: " + getEspecialidad() + "\nHoras de docencia: " + getHorasDocencia();
    }




























}
