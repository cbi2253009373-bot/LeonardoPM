public class Auto {
 //Atributos 
 String marca;
 String modelo;
 int velocidad;

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
    this.velocidad = (velocidad + incremento );
  }
   public void frenar(int frenado){
      this.velocidad = (velocidad - frenado);
   }
  
public void mostrarInformacion(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Velocidad: " + velocidad + " km/h");
  }





















}
