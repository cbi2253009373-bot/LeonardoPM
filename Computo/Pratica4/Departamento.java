public class Departamento {
    private String nombre;
    private String ubicacion;
    private String codigo;
    private PDI [] profesores;;
    private int contador;
    public Departamento(String nombre, String ubicacion, String codigo){
        profesores = new PDI[10];
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.codigo = codigo;
        contador = 0;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void agregarProfesor(PDI profesor){
        if(contador < profesores.length){
            profesores[contador] = profesor;
            contador++;
        } else {
            System.out.println("No se pueden agregar más profesores");
            }
    }
    
    //metodo para buscar profesor completo de objeto
    public int busquedaProfesorRecursivo(PDI profesorBuscado, int pos) {
     if (pos >= contador) {
        return -1;
     }
     if (profesores[pos].equals(profesorBuscado)) {
        return pos;
     }
     return busquedaProfesorRecursivo(profesorBuscado, pos + 1);
    }
   public void listarProfesores(){
     System.out.println("Profesores del departamento " + getNombre() + ":");
        for (int i = 0; i < contador; i++) {
            System.out.println("Profesor " + (i + 1) + ":");
            System.out.println(profesores[i]);
        }
    }
    @Override
    public String toString(){
        return "Nombre del departamento: " + getNombre() + "\nUbicación: "
        + getUbicacion() + "\nCódigo: " + getCodigo();
    }
}
    












