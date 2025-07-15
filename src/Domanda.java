// Classe Domanda - rappresenta una domanda a risposta aperta
public class Domanda {
    // Attributi: testo della domanda e risposta corretta
    private String testo;
    private String rispostaCorretta;

    // Costruttore con parametri per inizializzare i campi
    public Domanda(String testo, String rispostaCorretta) {
        this.testo = testo;
        this.rispostaCorretta = rispostaCorretta;
    }

    // Metodo per stampare la domanda
    public void mostraDomanda() {
        System.out.println(testo);
    }

    // Metodo per verificare se la risposta dell’utente è corretta
    public boolean verificaRisposta(String rispostaUtente) {
        return rispostaUtente.equalsIgnoreCase(rispostaCorretta);
    }
}

