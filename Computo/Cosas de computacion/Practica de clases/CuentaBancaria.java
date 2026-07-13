
public class CuentaBancaria{
//Atributos
 private String titular;
 private double saldo;
 private double dinero;
 //Constructor
  public CuentaBancaria(String titular , double saldo, double dinero){
   this.titular = titular ;
   this.saldo = saldo ;
    this.dinero = dinero;
  }
  //get y set
  public void setDinero(double dinero){
   this.dinero = dinero;
  }
  public double getDinero(){
    return this.dinero;
  } 
  public void setTitular(String titular){
  this.titular = titular ;
  }
  public String getTitular(){
   return this.titular;
  }
  public void setSaldo(double saldo){
   this.saldo = saldo;
  }
  public double getSaldo(){
   return this.saldo;
  }
  //acabamos los geter
  //metodos para depositar y retirar
  public void Depositar(double dinero){
  this.saldo = ( saldo + dinero );
  }
  public void Retirar(double dinero){
   if (saldo <= 0 ){
    System.out.println("Error: Saldo insuficiente");
    }else{
    this.saldo = (saldo - dinero);
    }
  }
 public void mostrarInfo(){
  System.out.println("Cliente : "+titular);
  System.out.println("Tu saldo es: "+saldo);
 }






}

