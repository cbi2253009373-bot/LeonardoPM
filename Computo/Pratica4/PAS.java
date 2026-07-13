import java.time.*;
public class PAS {
  private String area;
  private int nivel;
  private String turno;
  private Trabajador [] trabajador = new Trabajador [3];
 public PAS(String nombre , LocalDate fechaNacimiento , String direccion , LocalDate fechaIngreso ,double Salario, String puesto, String area, int nivel, String turno , Trabajador [] trabajador){
  this.trabajador[0] = new Trabajador("Laura", LocalDate.of(1985,4,15),  "Monterrey",  LocalDate.of(2012,1,1),  18000,   "Asesor");
  this.trabajador[1] = new Trabajador("Pedro", LocalDate.of(1990,5,20), "Puebla", LocalDate.of(2015,3,1), 20000, "Gfe de departamento");
  this.trabajador[2] = new Trabajador("María", LocalDate.of(1988,7,10), "Querétaro", LocalDate.of(2018,6,1), 22000, "Secretario");
    this.area = area;
    this.turno = turno;
    this.nivel = nivel;
 }
 public void setArea(String area){
  this.area = area;
 }
 public String getArea(){
 return area;
 }
 public void setTurno(String turno){
   this.turno = turno;
 }
 public String getTurno(){
   return turno;
 }
 public void setNivel(int nivel){
   this.nivel = nivel;
 }
 public int getNivel(){
   return nivel;
 }

  public void administrarRecursos(){
   for(int i = 0 ; i <trabajador.length; i++){
      System.out.println("Trabajador: " +trabajador[i].getNombre()+" Pertenece al area: "+getArea());
   }
  }
//Agrengado la recurisviad
public int busquedaTrabajadorrecursivo(String nombre, int pos){
   if (pos >= trabajador.length){
     return -1;
    }
   if (trabajador[pos].getNombre().equals(nombre)){
     return pos;
    }
    return busquedaTrabajadorrecursivo(nombre , pos+1);
  }
 public void generarReporte(){
  System.out.println("Reporte de trabajadores del PAS: ");
   for(int i = 0 ; i < trabajador.length; i++){
    System.out.println("========Trabajador " + (i+1) + "============" +
    "\nNombre: " + trabajador[i].getNombre() +
    "\nArea: "+getArea()+
    "\nTurno: "+getTurno()+
    "\nNivel: "+getNivel()+
    "\nDireccion: "+trabajador[i].getDireccion()+
    "\nFecha de ingreso: "+trabajador[i].getFechaIngreso()+
    "\nSalario: "+trabajador[i].getSalario()+
    "\nPuesto: "+trabajador[i].getPuesto());
  }
 }































}
