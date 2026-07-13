public class Automovil{
 //Atrivutos
  private String marca;
  private int anio;
  private String modelo;
 //constructor 
  public Automovil(String marca, int anio, String modelo ){
  this.marca = marca;
  this.anio = anio; 
  this.modelo = modelo;
  }

  //Getter y setder
  public void setMarca (String marca){
  this.marca = marca;
   }

   public String getMarca(){
   return marca;
   }
   public void setAnio(int anio){
   this.anio = anio;
    }
   public int getAnio(){
    return anio;
   }
   public void setModelo(String modelo){
   this.modelo = modelo;
  }
   public String getModelo(){
  return modelo;
  }
  //metodos propios
  public void acelerar(){
  int velocidad = 320;
  int incremento = 20;
  int velocidadfinal;
  System.out.println("Tu velocidad actual es de: "+velocidad+"km/h");
  System.out.println("Has incrementado: "+incremento+"km/h");
  velocidadfinal = velocidad + incremento;
  System.out.println("Tu velocidad ahora es de : "+velocidadfinal);
  }
  public to String (){
  System.out.println("Modelo: "+modelo
                  +"\nAño: "+anio
                   +"\Marca: "+marca);


  }






}
