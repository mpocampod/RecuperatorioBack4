import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Paulina Ocampo ", 2000.0);

        System.out.println("Tu datos de la cuenta son " + "\n" + c1.getDatosCuenta());

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Si desea realizar un ingreso oprima 1 " + "\n");
            System.out.println("Si desea realizar un retiro oprima 2 " + "\n");
            System.out.println("Si desea salir oprima 0 " + "\n");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuánto dinero vas a ingresar? " + "\n");
                    double ingreso = scanner.nextDouble();
                    c1.setIngreso(ingreso);
                    System.out.println("Tu datos actualizados de la cuenta son " + "\n" + c1.getDatosCuenta());
                    break;

                case 2:
                    System.out.println("Cuánto dinero vas a retirar? " + "\n");
                    double retiro = scanner.nextDouble();
                    c1.setRetiro(retiro);
                    System.out.println("Tu datos actualizados de la cuenta son " + "\n" + c1.getDatosCuenta());
                    break;

            }
        } while (opcion > 0);

    }
}
