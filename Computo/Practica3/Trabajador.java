import java.time.LocalDate;

public class Trabajador extends Persona {
     private CuentaCorriente cuentaCorriente;
     private LocalDate fechaIngreso;
     private double Salario;
     private String puesto;
    public Trabajador(String nombre , LocalDate fechaNacimiento , String direccion , LocalDate fechaIngreso ,double Salario, String puesto  ){
        super(nombre, fechaNacimiento, direccion);
        this.fechaIngreso = fechaIngreso;
        this.puesto = puesto;
        this.Salario = Salario;
    }
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorriente = cuentaCorriente;
    }
    public CuentaCorriente getCuentaCorriente(){
        return cuentaCorriente;
    }
        
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
    public void setSalario(double Salario ){
        this.Salario = Salario ;
    }
    public double getSalario(){
        return Salario;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return puesto;
    }
    public void CalculoAnti(){
       LocalDate fechaactual = LocalDate.now();
      int actual;
          actual = (fechaactual.getYear() - this.fechaIngreso.getYear());
          System.out.println("Tus años trabajado: "+actual);
        
    }
    public void SolciVaca(){
      LocalDate fechaactual = LocalDate.now();
      int actual;
          actual = (fechaactual.getYear() - this.fechaIngreso.getYear());
          if (actual < 10){
            System.out.println("No puedes tener vacaciones porque no tienes 10 años de antiguedad");
          }else{
            System.out.println("Si puedes tener vacaciones porque tienes 10 años o mas años de antiguedad");
        }
    }
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nFecha de Nacimiento: "+getFechaNacimiento()+"\nDireccion: "+getDireccion()+"\nFecha de Ingreso: "+getFechaIngreso()+"\nSalario: "+getSalario()+"\nPuesto: "+getPuesto();
    }
}
