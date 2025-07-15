import java.util.ArrayList;

// Classe RegistroStudenti - gestisce una lista di oggetti Studente
public class RegistroStudenti {
    // ArrayList privato per memorizzare gli studenti
    private ArrayList<Studente> registro;

    // Costruttore che inizializza l'ArrayList
    public RegistroStudenti() {
        this.registro = new ArrayList<>();
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente s) {
        registro.add(s);
    }

    // Metodo per stampare tutti gli studenti del registro
    public void stampaRegistro() {
        for (Studente s : registro) {
            System.out.println(s.getInfoStudente());
        }
    }
}
