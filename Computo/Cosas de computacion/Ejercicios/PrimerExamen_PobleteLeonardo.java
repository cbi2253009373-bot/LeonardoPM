import java.util.Scanner;
public class PrimerExamen_PobleteLeonardo{
    
    public static void main (String args[]){
     Scanner sc = new Scanner (System.in); 
  
     double Exam1,Exam2, Exam3, Exam4, Prom_Exam, Calif_Base , Proyecto_Final;



      System.out.println("Ingresa tus 4 calificaciones de examenes parciales");
      do{
        System.out.println("Ingresa la calificacion de tu primer examen");
        Exam1=sc.nextDouble();
      }while(Exam1<0||Exam1>10);

     do{
      System.out.println("Ingresa la calificacion de tu segundo examen");
      Exam2=sc.nextDouble();
     }while(Exam2<0||Exam2>10);

      do{
       System.out.println("Ingresa la calificacion de tu tercer examen");
       Exam3=sc.nextDouble();
     }while(Exam3<0||Exam3>10);

     do{
      System.out.println("Ingresa la calificacion de tu cuarto examen");
      Exam4=sc.nextDouble();
     }while(Exam4<0||Exam4>10);


     System.out.println("Ingresa la calificacion de tu proyecto final");
     do{
      System.out.println("Ingresa la calificacion de tu proyecto final");
      Proyecto_Final=sc.nextDouble();
      }while(Proyecto_Final<0||Proyecto_Final>10);

    if(Proyecto_Final<6){
    System.out.println("Tu proyecto final no es aprobatorio asi que no pasas,tu calficicacion es N/A");
    }else{
       if(Exam1<=Exam2&&Exam1<=Exam3&&Exam1<=Exam4){
         System.out.println("Tu calificacion 1 es la mas baja"+Exam1);
         Exam1=0;
         Prom_Exam=((Exam2+Exam3+Exam4)/3);
         Calif_Base = ((Prom_Exam*0.6)+(Proyecto_Final*0.4));
     
         if(Calif_Base<6){
           System.out.println("Tu calificacion es N/A");
         }else{
           if(Calif_Base>=6 && Calif_Base<7.5){
           System.out.println("Tu calificacion es S");
           }else{
            if(Calif_Base>=7.5 && Calif_Base<8.5){
             System.out.println("Tu calificacion es B");
             }else{
               if(Calif_Base>=8.5){
                System.out.println("Tu calficacion es MB");
               }
             }
            }
          }
       }else{
          if(Exam2<=Exam1&&Exam2<=Exam3&&Exam2<=Exam4){
          System.out.println("Tu calificaion 2 es la mas baja"+Exam2);
           Exam2=0;
            Prom_Exam=((Exam1+Exam3+Exam4)/3);
            Calif_Base = ((Prom_Exam*0.6)+(Proyecto_Final*0.4));

          if(Calif_Base<6){
          System.out.println("Tu calificacion es N/A");
          }else{
          if(Calif_Base>=6 && Calif_Base<7.5){
            System.out.println("Tu calificacion es S");
            }else{
               if(Calif_Base>=7.5 && Calif_Base<8.5){
                System.out.println("Tu calificacion es B");
                }else{
                 if(Calif_Base>=8.5){
                 System.out.println("Tu calficacion es MB");
                 }
                }
            }
          }





        }else{
            if(Exam3<=Exam1&&Exam3<=Exam2&&Exam3<=Exam4){
                System.out.println("Tu calificacion 3 es la mas baja"+Exam3);
                Exam3=0;
                Prom_Exam=((Exam2+Exam1+Exam4)/3);
                Calif_Base = ((Prom_Exam*0.6)+(Proyecto_Final*0.4));



                if(Calif_Base<6){
                System.out.println("Tu calificacion es N/A");
                }else{
                 if(Calif_Base>=6 && Calif_Base<7.5){
                 System.out.println("Tu calificacion es S");
                }else{
                  if(Calif_Base>=7.5 && Calif_Base<8.5){
                  System.out.println("Tu calificacion es B");
                 }else{
                  if(Calif_Base>=8.5){
                   System.out.println("Tu calficacion es MB");
                  }
                }
               }
             }





        }else{
            if(Exam4<=Exam1&&Exam4<=Exam2&&Exam4<=Exam3){
            System.out.println("Tu calificacion 4 es la mas baja"+Exam4);
            Exam4=0;
             Prom_Exam=((Exam2+Exam3+Exam1)/3);
              Calif_Base = ((Prom_Exam*0.6)+(Proyecto_Final*0.4));
                if(Calif_Base<6){
                 System.out.println("Tu calificacion es N/A");
                   }else{
                     if(Calif_Base>=6 && Calif_Base<7.5){
                        System.out.println("Tu calificacion es S");
                     }else{
                        if(Calif_Base>=7.5 && Calif_Base<8.5){
                         System.out.println("Tu calificacion es B");
                        }else{
                         if(Calif_Base>=8.5){
                          System.out.println("Tu calficacion es MB");
                         }
                        }
                      }
                    }

                }
            }
        }   
     }

















     
    }
sc.close();
  }
     


 
}

