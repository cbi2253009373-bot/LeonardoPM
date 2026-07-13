public class CuentaCorriente extends CuentaBancaria {
    //Atributos
    private double comision;

    public CuentaCorriente(double saldo, String numeroCuenta, double comision) {
        super(saldo, numeroCuenta);
        this.comision = comision;
    }
    //get y set
    public void setComision(double comision) {
        this.comision = comision;
    }
    public double getComision() {
        return comision;
    }
    //metodos
    public void girarCheque(double monto) {
        System.out.println("Girando cheque por: " + monto);
        retirar(monto);
    }

    public void cobrarComision(){
    System.out.println("Se cobra la comision de: "+getComision());
    retirar(getComision());
   }











}
