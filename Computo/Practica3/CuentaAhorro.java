public class CuentaAhorro extends CuentaBancaria {
  //Atributos
   double montoLimite;
   double tasa; // La tasa debe de estar en numero entero sin porcentaje
 //constricor
  public CuentaAhorro(double monto , String numeroCuenta , double montoLimite , double tasa ){
  super(monto , numeroCuenta);
  this.montoLimite = montoLimite;
  this.tasa = tasa;
 }
//su get y set
 public void setTasa(double tasa) {
  this.tasa = tasa;
 }
 public double getTasa() {
  return tasa;
 }
 public void setMontoLimite(double montoLimite) {
  this.montoLimite = montoLimite;
 }
 public double getMontoLimite() {
  return montoLimite;
  }
//metodos propios
 public double calcularIntereses(){
  double intereses = (getSaldo() * getTasa()) / 100;
  System.out.println("Los intereses generados son: "+intereses);
  return intereses;
 }
 public void aplicarIntereses() {
    double intereses = calcularIntereses();
    setSaldo(getSaldo() + intereses);
    System.out.println("Los intereses se agregaron a la cuenta.");
    System.out.println("Saldo actual con intereses: " + getSaldo());
}

 @Override
 public void retirar(double monto){
  if (monto > 0 && monto <= getSaldo() && monto <= getMontoLimite()){
   setSaldo(getSaldo() - monto);
   System.out.println("Tu retiro de: "+monto+" se a realizado con exito");
   System.out.println("Saldo actual: "+getSaldo());
  }else{
   if (monto > getMontoLimite()){
    System.out.println("Error: El monto a retirar excede el limite permitido de: "+getMontoLimite());
    }else{
      if (monto > getSaldo()){
       System.out.println("Error: Saldo insuficiente");
      }else{
        System.out.println("Error: Monto invalido");
      }
    }
  }
  





 }




































}
