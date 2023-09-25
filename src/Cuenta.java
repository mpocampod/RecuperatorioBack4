import java.util.Random;

public class Cuenta {

    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = numeroAlehatorio();
    }

    public long numeroAlehatorio() {
        Random numero = new Random();
        return Math.abs(numero.nextLong());

    }

    public void setIngreso(double cantidad) {
        if (cantidad > 0) {
            saldoDeCuenta += cantidad;
            System.out.println(" Tu nuevo saldo es de: " + saldoDeCuenta);
        }
    }

    public void setRetiro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldoDeCuenta) {
            saldoDeCuenta -= cantidad;
            System.out.println(" Tu nuevo saldo es de: " + saldoDeCuenta);
        } else {
            System.out.println(" No tienes esa cantidad de dinero ");
        }

    }

    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "Nombre del titular: " + this.nombreDelTitular + "\n" + "Número de cuenta: " + this.numeroDeCuenta + "\n"
                + "Saldo de cuenta: " + this.saldoDeCuenta + "\n";
    }

}
