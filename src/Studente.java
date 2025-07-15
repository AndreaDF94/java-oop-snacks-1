// Classe Studente - rappresenta uno studente con nome, cognome ed età
public class Studente {
    // Attributi privati della classe
    private String nome;
    private String cognome;
    private int eta;

    // Costruttore con 3 parametri per inizializzare lo studente
    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // Metodo per restituire una stringa con i dati dello studente
    public String getInfoStudente() {
        return nome + " " + cognome + ", " + eta + " anni";
    }
}