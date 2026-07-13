public class Auto {
 //Atributos 
 private String marca;
 private String modelo;
 private int velocidad;

 public Auto(String marca, String modelo , int velocidad ){
 this.marca = marca;
 this.modelo = modelo;
 this.velocidad = velocidad;
 }
 //Metodos set y get
 public void setMarca(String marca ){
  this.marca = marca;
 }
    public String getMarca(){
    return this.marca;
    }
    public void setModelo(String modelo){
    this.modelo = modelo;
    }
    public String getModelo(){
    return this.modelo;
    }
    public void setVelocidad(int velocidad){
    this.velocidad = velocidad;
    }
    public int getVelocidad(){
    return this.velocidad;
    }

 //Metodos 
 public void acelerar(int incremento){
    
      System.out.println("***********Informacion del auto*************");
      System.out.println("Velocidad inicial: " + velocidad + " km/h");
      this.velocidad = (velocidad + incremento);
      System.out.println("El auto acelero " + incremento + " km/h");
    System.out.println("El auto ha acelerado a " + velocidad + " km/h");
  }
   public void frenar(int frenado){
      
      System.out.println("***********Informacion del auto*************");
         System.out.println("Velocidad inicial: " + velocidad + " km/h");
      this.velocidad = (velocidad - frenado);
      System.out.println("El auto freno " + frenado + " km/h");
      System.out.println("El auto ha frenado a " + velocidad + " km/h");
   }
  
 public void mostrarInformacion(){
    System.out.println("      Marca: " + marca);
    System.out.println("     Modelo: " + modelo);
    System.out.println("  Velocidad: " + velocidad + " km/h");
    System.out.println("************************************");  
   }
 




















}
