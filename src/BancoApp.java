
public class BancoApp {

    private  double saldo;

    public   BancoApp(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public  void  retirarDinero( double cantidad)  throws  Exception {
        if (cantidad > saldo){
            throw new Exception("¡oops! saldo insuficiente");
        }else {
            saldo -= cantidad;
            System.out.println("retiro Exitoso, se han retirado $" + cantidad  );
            System.out.println("saldo total $" + saldo  );
        }
    }

    public void depositarDinero(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede depositar una cantidad negativa.");
        } else {
            saldo += cantidad;
            System.out.println("Se han depositado: $" + cantidad);
        }
    }

    public void transferirDinero(BancoApp otraCuenta, double cantidad) throws Exception {
        try {
            this.retirarDinero(cantidad);
            otraCuenta.depositarDinero(cantidad);
            System.out.println("Se han transferido: $" + cantidad + " a otra cuenta.");
        } catch (Exception e) {
            throw new Exception("Transferencia fallida: " + e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
