import java.time.LocalDate;

public class MainPractica3 {
    public static void main(String[] args) {
        CuentaCorriente cuentaTrabajador = new CuentaCorriente(1000, "123456789", 50);
        Trabajador trabajador1 = new Trabajador("Conta. Luis", LocalDate.of(2008, 9, 17), "Ciudad de mexico", LocalDate.of(2026, 6, 9), 50000, "Almacenista");
        trabajador1.setCuentaCorriente(cuentaTrabajador);
     System.out.println("****************Trabajador*****************");
     System.out.println(trabajador1);
     System.out.println("Numero de cuenta: "+trabajador1.getCuentaCorriente().obtenerNumero());
     trabajador1.getCuentaCorriente().depositar(1000);
     trabajador1.getCuentaCorriente().retirar(1500);
     trabajador1.getCuentaCorriente().cobrarComision();
     System.out.println("Saldo final: "+ trabajador1.getCuentaCorriente().consultarSaldo());
     System.out.println("");

     CuentaAhorro cuentaEstudiante =  new CuentaAhorro(3000, "987654321", 2000, 5);
     Estudiante estudiante1 = new Estudiante("Leonardo",LocalDate.of(2007, 5, 20),"Saltillo","2253009373",9.5,LocalDate.of(2024, 8, 1));
        estudiante1.setCuentaAhorro(cuentaEstudiante);
        System.out.println("============ ESTUDIANTE ===========");
        System.out.println(estudiante1);
        System.out.println("Número de cuenta: " + estudiante1.getCuentaAhorro().obtenerNumero());
        System.out.println("Saldo inicial: "+estudiante1.getCuentaAhorro().getSaldo());
        estudiante1.getCuentaAhorro().depositar(500);
        System.out.println("Saldo antes de los intereses"+estudiante1.getCuentaAhorro().getSaldo());
        estudiante1.getCuentaAhorro().aplicarIntereses();
        estudiante1.getCuentaAhorro().retirar(800);

        System.out.println("Intereses generados: " + estudiante1.getCuentaAhorro().calcularIntereses());
        System.out.println("Saldo final: " + estudiante1.getCuentaAhorro().consultarSaldo());
    }
}
