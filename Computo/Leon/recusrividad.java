package Leon;

public class recusrividad {
    //metodo revurisvo valido apra buscar un profesor por especialidad
    public int busquedaProferecursivo(String especialidad, int pos){
      if (pos >= contador){
             return -1;
           }
        if (profesores[pos].getEspecialidad().equals(especialidad)){
             return pos;
            }
        return busquedaProferecursivo(especialidad, pos+1);
    }
}
