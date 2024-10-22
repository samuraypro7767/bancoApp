public class Main {
    public static void main(String[] args) {


            try {
                BancoApp cuenta1 = new BancoApp(1000);
                BancoApp cuenta2 = new BancoApp(500);

                cuenta1.depositarDinero(200);
                cuenta1.retirarDinero(500);
                cuenta1.transferirDinero(cuenta2, 300);

                System.out.println("Saldo de la cuenta 1: $" + cuenta1.getSaldo());
                System.out.println("Saldo de la cuenta 2: $" + cuenta2.getSaldo());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }



    }
}