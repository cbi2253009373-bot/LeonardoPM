public class Universidad {
    private String nombre;
    private String ciudad;
    private int fundacion;
    private Departamento [] departamentos;
    private Estudiante [] estudiantes;
    private Trabajador [] trabajos;
    private int contEstudiantes;
    private int contTrabajos;
    private int contDepartamentos;
    public Universidad(String nombre, String ciudad, int fundacion){
    this .nombre = nombre;
    this.ciudad = ciudad;
    this.fundacion = fundacion;
    estudiantes = new Estudiante[50];
    trabajos = new Trabajador[100];
    departamentos = new Departamento[20];
    this.contEstudiantes = 0;
    this.contTrabajos = 0;
    this.contDepartamentos = 0;

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setFundacion(int fundacion){
        this.fundacion = fundacion;
    }
    public int getFundacion(){
        return fundacion;
    }
    public void agregarDepartamento(Departamento departamento){
         if(contDepartamentos < departamentos.length){
            departamentos[contDepartamentos] = departamento;
         contDepartamentos++;
        } else {
           System.out.println("No se pueden agregar mas departamentos");
        }
        
    }
    
    public void agregarEstudiante(Estudiante estudiante){
       
        if(contEstudiantes < estudiantes.length){
           estudiantes[contEstudiantes] = estudiante;
           contEstudiantes++;
        } else {
            System.out.println("No se pueden agregar mas estudiantes");
        }
        
    }
    public void agregarTrabajador(Trabajador trabajador){
       if(contTrabajos < trabajos.length){
            trabajos[contTrabajos] = trabajador;
            contTrabajos++;
        } else {
            System.out.println("No se pueden agregar mas trabajadores");
        }
       
    }
 //Metodo para la recurisvad
 public int busquedaDeparecursivo(String codigo, int pos){
    if(pos >= contDepartamentos){
        return -1;
        }
     if(departamentos [pos] != null && departamentos[pos].getCodigo().equals(codigo)){
     return pos;
     }
   return busquedaDeparecursivo(codigo, pos+1);
 }

 public int busquedaEstudianterecursivo(String matricula, int pos){
    if(pos >= contEstudiantes){
       return -1;
      }
     if(estudiantes[pos] != null && estudiantes[pos].getMatricula().equals(matricula)){
     return pos;
      }
    return busquedaEstudianterecursivo(matricula, pos+1 );
 }

 public int buscarTrabajadorrecursivo(String nombre, int pos){
    if (pos >= contTrabajos){
      return -1;
        }
     if(trabajos[pos] != null && trabajos[pos].getNombre().equals(nombre)){
       return pos;
       }
    return buscarTrabajadorrecursivo(nombre,pos+1);
 }


 //metodo mostar el contendio de estos arreglos
    public void mostrarEstudiantes(){
        for(int i = 0; i < contEstudiantes; i++){
            System.out.println(estudiantes[i]);
            System.out.println("==========================");
        }
    }

    public void mostrarTrabajadores(){
        for(int i = 0; i < contTrabajos; i++){
            System.out.println(trabajos[i]);
            System.out.println("===========================");
        }
    }

    public void mostrarDepartamentos(){
        for(int i = 0; i < contDepartamentos; i++){
            System.out.println(departamentos[i]);
            System.out.println("===========================");
        }
    }

    @Override
    public String toString(){
        return "Universidad: " + getNombre() + " Ubicacion: " + getCiudad() + " Fundadana: " + getFundacion();
    } 
}
