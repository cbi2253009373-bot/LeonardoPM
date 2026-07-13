import java.util.Scanner;
 public class Practicadearreglos{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] Calif_studens = new double[50];

        double Prom_gen, calif_menor, suma, calif_alta, Rango_grupo;
        double conteo_aprovados, conteo_reprobados, arriba_prom, abajo_prom,suficiente, bueno, excelente;

       

        int No_studens, i;

        do{
            System.out.println("Ingresa el numero de tus alumnos\n");
            No_studens = sc.nextInt();
        }while(No_studens<5||No_studens>40);

        calif_alta=0;
        calif_menor=10;
        suma=0;
        conteo_aprovados=0;
        conteo_reprobados=0;

        suficiente=0;
        bueno=0;
        excelente=0;

        for (i=0;i<No_studens;i=i+1){

            do {
                System.out.println("Ingresa las calificaciones de tus estudiantes\n"+(i+1));
                Calif_studens[i]=sc.nextDouble();
            } while (Calif_studens[i]<0||Calif_studens[i]>10);

           
            if (calif_menor>Calif_studens[i]){
                calif_menor=Calif_studens[i];
            }

            if (calif_alta<Calif_studens[i]){
                calif_alta=Calif_studens[i];
            }

            suma=suma+Calif_studens[i];
    
            if(Calif_studens[i]<6){
                conteo_reprobados=conteo_reprobados+1;
            }else{
               if (Calif_studens[i]<7) {
                suficiente = suficiente+1;
                conteo_aprovados=conteo_aprovados+1;
               }else{
                    if (Calif_studens[i]<9) {
                      bueno=bueno+1;
                      conteo_aprovados=conteo_aprovados+1;
                    }else{
                        excelente=excelente+1;
                       conteo_aprovados=conteo_aprovados+1;
                    }
               }
            } 
           
        Prom_gen=suma/No_studens;
        Rango_grupo=(calif_alta-calif_menor);

        abajo_prom=0;
        arriba_prom=0;

        for (i=0;i<No_studens;i=i+1){

            if (Calif_studens[i]>Prom_gen){
                arriba_prom=arriba_prom+1;
            }

            if (Calif_studens[i]<Prom_gen){
                abajo_prom=abajo_prom+1;
            }
        }

      

        System.out.println("Los alumnos arriba del promedio son " +arriba_prom);
        System.out.println("Los alumnos abajo del promedio son " +abajo_prom);
        System.out.println("Los alumnos aprovados son " +conteo_aprovados);
        System.out.println("Los alumnos reprovados son " +conteo_reprobados);

        System.out.println("Los alumnos reprovados (menos de 6)"+conteo_reprobados);
        System.out.println("Los alumnos de Suficientes (6 a <7): " +suficiente);
        System.out.println("Los alumnos de Buenos (7 a <9): " +bueno);
        System.out.println("Los alumnos de Excelentes (9 a 10): " +excelente);
        System.out.println("La calificacion mas alta es " + calif_alta);
        System.out.println("La calificacion mas baja es esta " +calif_menor);
        System.out.println("El rango es " + Rango_grupo);
        System.out.println("El primedio de tu grupo es " +Prom_gen);

  
    }
    sc.close();
  }
}

