public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = ceunta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1);
    }

    public static void operativa_cuenta(CCuenta cuenta) {
        try {
            cuenta.retirar(2300);
            System.out.println("Se ha retirado 2300 euros de la cuenta");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            cuenta.ingresar(695);
            System.out.println("Se ha ingresado 695 euros en la cuenta");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }

        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es "+saldoActual);
    }
}