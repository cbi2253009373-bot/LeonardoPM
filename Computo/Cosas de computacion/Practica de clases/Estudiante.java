public class Estudiante {
    private String nombre;
    private String matricula;
    private Double promedio;
    public Estudiante(String nombre, String matricula, Double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    public Double getPromedio() {
        return promedio;
    }
    public void Aprobo(){
        if (promedio >= 6.0) {
            System.out.println("El estudiante a aprobado");
        } else {
            System.out.println("Repobrado");
        }
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
}