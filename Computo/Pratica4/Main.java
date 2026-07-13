import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", LocalDate.of(1990, 1, 15), "Canal periferico");
        System.out.println("=================================Persona=============================");
        System.out.println(p1);
        System.out.println("Edad: " + p1.obtenerEdad() + " años");
        p1.AdultoMayor();
        //Termina persona

        //Inicia trabajador
        Trabajador t1 = new Trabajador("Carlos", LocalDate.of(1985, 6, 10), "Monterrey", LocalDate.of(2010, 2, 1), 15000, "Profesor Administrativo");
        Trabajador t2 = new Trabajador("Maria", LocalDate.of(1990, 3, 20), "Guadalajara", LocalDate.of(2018, 6, 5), 12000, "Profesor de Tiempo Completo");
        System.out.println("================================Trabajador===========================");
        System.out.println("==============TRABAJADOR 1==============");
        System.out.println(t1);
        t1.CalculoAnti();
        t1.SolciVaca();
        System.out.println("==============TRABAJADOR 2==============");
        System.out.println(t2);
        t2.CalculoAnti();
        t2.SolciVaca();
        //Termina trabajador

        //Inicia PAS
        Trabajador [] trabajador = new Trabajador [3];
        PAS pas1 = new PAS("María", LocalDate.of(1992, 4, 5), "Monterrey", LocalDate.of(2015, 3, 1), 18000, "Administrativo","Escolar", 3 , "Matutino", trabajador);
        System.out.println("=================================PAS=================================");
        System.out.println("Areas a los que pertenecen: ");
        pas1.administrarRecursos();
        pas1.generarReporte();
        //Termina PAS

        //Inicia Departamento
        System.out.println("=============================Departamento============================");
         Departamento sistemas = new Departamento("Computación", "Edificio AT", "AT220");
         System.out.println(sistemas);
         PDI profesor1 = new PDI("Dr. García", "Computacion", 20);
         PDI profesor2 = new PDI("Dra. López", "Matematicas", 15);
         System.out.println("==================Profesores agregados al departamento==============");
        sistemas.agregarProfesor(profesor1);
        sistemas.agregarProfesor(profesor2);
        System.out.println("==============Profesor 1============== ");
        System.out.println(profesor1);
        System.out.println("==============Profesor 2============== ");
        System.out.println(profesor2);
        //Termina Departamento

        //inicia estudiante
        Estudiante e1 = new Estudiante("Anamelisa", LocalDate.of(2004, 5, 10), "CDMX", "A001", 8.5, LocalDate.of(2023, 8, 1));
        Estudiante e2 = new Estudiante("Luis", LocalDate.of(2003, 3, 20), "Puebla", "A002", 9.2, LocalDate.of(2022, 8, 1));
        Estudiante estudiantebuscado = new Estudiante("Leonardo", LocalDate.of(2007, 9, 17), "Guerrero", "A002", 9.5, LocalDate.of(2024, 8, 1));
        //Termina estudiante
        
        System.out.println("=================================Estudiante y trabajador===========================");
        System.out.println("=============Pruebas del equals============== ");
        System.out.println("El estudante e1 es igual al estudiantebuscado: " + e1.equals(estudiantebuscado));
        Trabajador trabajadorbuscado = new Trabajador("Carlos", LocalDate.of(1985, 6, 10), "Monterrey", LocalDate.of(2010, 2, 1), 15000, "Profesor");
        System.out.println("El trabajador t1 es igual al trabajadorbuscado: " + t1.equals(trabajadorbuscado));
        PDI profesorbuscado = new PDI("Dr. García", "Computacion", 20);
        System.out.println("El profesor profesor1 es igual al profesorbuscado: " + profesor1.equals(profesorbuscado));
        System.out.println("=============Pruebas del compareTo============== ");
        int comparacion = e1.compareTo(e2);
        if (comparacion == 0) {
            System.out.println("Los estudiantes e1 y e2 tienen la misma matrícula.");
        } else 
           if (comparacion < 0) {
            System.out.println("El estudiante e1 tiene una matrícula antes que el estudiante e2.");
            } else {
            System.out.println("El estudiante e1 tiene una matrícula despues que el estudiante e2.");
        }        
        
        //Inicia Universidad
        Universidad universidad = new Universidad(" UAM ", "CDMX Iztapalapa", 1974);
        System.out.println("==============================Universidad============================");
        universidad.agregarEstudiante(e1);
        System.out.println(universidad);
        System.out.println("==============Estudiante 1============== ");
        System.out.println(e1);
        universidad.agregarEstudiante(e2);
        System.out.println("==============Estudiante 2============== ");
        System.out.println(e2);
        universidad.agregarTrabajador(t1);
        System.out.println("==============Trabajador 1============== ");
        System.out.println(t1);
        universidad.agregarTrabajador(t2);
        System.out.println("==============Trabajador 2============== ");
        System.out.println(t2);
        universidad.agregarDepartamento(sistemas);
        //Termina Universidad

        //busqueda de estudiante por matricula
        System.out.println("=========================Busqueda de estudiante======================="); 
        int posEstudiante = universidad.busquedaEstudianterecursivo("A001", 0);
        int posTrabajador = universidad.buscarTrabajadorrecursivo("Carlos", 0);
        int posDepartamento = universidad.busquedaDeparecursivo("AT220", 0);
        System.out.println("Posición del estudiante con matrícula A001: " + posEstudiante);
        System.out.println("Posición del trabajador con nombre Carlos: " + posTrabajador);
        System.out.println("Posición del departamento con código AT220: " + posDepartamento);
        //Termina busqueda de estudiante por matricula

        //Inicia EstudianteGrado
        System.out.println("==========================EstudianteGrado============================");
        EstudianteGrado est1 = new EstudianteGrado( "Leonardo", LocalDate.of(2007,5,20), "Saltillo", "A001",  9.5, LocalDate.of(2024,8,1), "Tesis",  320, true);
        System.out.println("==============Estudiante 1============== ");
        System.out.println(est1);
        System.out.println("Beca obtenida: " + est1.calcularBeca());
        EstudianteGrado est2 = new EstudianteGrado( "Maria", LocalDate.of(2008,3,15), "Monterrey", "A002",  8.5, LocalDate.of(2024,8,1), "Tesis",  280, false);
        System.out.println("==============Estudiante 2============== ");
        System.out.println(est2);
        System.out.println("Beca obtenida: " + est2.calcularBeca());
        //Termina EstudianteGrado

        //Inicia EstudianteDoctorado
        EstudianteDoctorado doc1 = new EstudianteDoctorado( "Ana", LocalDate.of(1998,3,10),"Monterrey",  "D001", 9.8,LocalDate.of(2025,1,10), "Curso a IA", "Afectaciones de IA", "Dr. García");
        System.out.println("=======================EstudianteDoctorado=========================");
        System.out.println(doc1);
        doc1.realizarTesis("Tema de tesis", "Dr. García");
        doc1.publicarArticulo("Tema de tesis", "Programa de investigación");
        //Termina EstudianteDoctorado
        //INICAI doctor
        System.out.println("================================ Doctor =============================");
          Doctor doctor1 = new Doctor("Inteligencia Artificial", "UAM", 2020);
         Doctor doctor2 = new Doctor("Inteligencia Artificial", "UAM", 2025);
         doctor1.registrarTitulo();
         System.out.println("¿El título del doctor es válido?");
         System.out.println(doctor1.validarTitulo());
         System.out.println("¿doctor1 es igual a doctor2?");
         System.out.println(doctor1.equals(doctor2));
        //terminal doctor
        //Inicia PDI
        PDI profesor = new PDI( "Profesor", "Ninguna", 20);
        PDI p11 = new PDI("Asesor", "Computación", 20);
        PDI p2 = new PDI("Tutor", "Mecánica", 15);
        PDI profesor3 = new PDI("Gfe de departamento","Matematicas", 8);
        System.out.println("=================================PDI=================================");
        System.out.println(profesor);
        System.out.println(p11);
        System.out.println(p2);
        System.out.println(profesor3);
        System.out.println("==============Busqueda de profesor por especialidad==============");
        int posProfesor3 = sistemas.busquedaProfesorRecursivo(profesor3, 0);
        System.out.println("Posición del profesor con especialidad Matematicas: " + posProfesor3);
        int posProfesor = universidad.buscarTrabajadorrecursivo("Maria", 0);
        System.out.println("Posición del trabajador con el nombre Maria: " + posProfesor);
        //Termina PDI
    }
}
