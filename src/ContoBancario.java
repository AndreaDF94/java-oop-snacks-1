// Classe ContoBancario - rappresenta un conto con numero e saldo
public class ContoBancario {
    // Attributi privati del conto
    private String numeroConto;
    private double saldo;

    // Costruttore che accetta numero conto e inizializza saldo a 0
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // Metodo per depositare denaro
    public void deposita(double importo) {
        saldo += importo;
    }

    // Metodo per prelevare denaro
    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
        } else {
            System.out.println("Fondi insufficienti.");
        }
    }

    // Metodo per ottenere il saldo corrente
    public double getSaldo() {
        return saldo;
    }
}
