public class CuentaBancaria implements Transaccionable {
  //Atributos
 private double saldo; //guarda la cantidad de dinero
 private  String numeroCuenta; //Almacena del num cuenta
  //Constructor
  public CuentaBancaria(double saldo, String numeroCuenta){
  this.saldo = saldo;
  this.numeroCuenta = numeroCuenta;
  }
 //Geter y setr
  public void setSaldo(double saldo){
   this.saldo = saldo;
  }

  public double getSaldo(){
  return saldo;
 }
 public void setNumCuenta(String numeroCuenta){
 this.numeroCuenta = numeroCuenta;

 }
 public String getNumCuenta(){
  return numeroCuenta;
 }
 @Override
 //Metodo de depositar
 public void depositar (double monto ){
   if (monto > 0 ){
    System.out.println("Tu saldo antes del deposito: "+saldo);
      saldo = ( saldo + monto );
      System.out.println("Se a realizado el deposito de: "+monto);
      System.out.println("Nuevo saldo: "+saldo);
   }else{
     System.out.println("Error: El monto a depositar debe de ser mayor a 0");
    }
 }

 @Override
 //Metodo de retirar
 public void retirar(double monto ){
   if (monto > 0 && monto <= saldo ){
    System.out.println("Tu saldo antes del retiro: "+saldo);
    saldo = (saldo - monto );
    System.out.println("Tu retiro de: "+monto+" se a realizado con exito");
    System.out.println("Saldo actual: "+saldo);
    }else{
    System.out.println("Saldo insuficiente o monto invalido");
    }
 }
//metodo de consultar saldo
 public double consultarSaldo(){
  System.out.println("Tu saldo es: "+getSaldo());
  return getSaldo();
 }
public String obtenerNumero(){
  System.out.println("Tu numero de cuenta es: "+getNumCuenta());
  return getNumCuenta();
 }


















}
