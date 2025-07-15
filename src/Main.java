import java.util.Scanner;

// Classe Main per testare il funzionamento della domanda
public class Main {
    public static void main(String[] args) {
        // Creazione della domanda con la risposta corretta
        Domanda d1 = new Domanda("Qual è la capitale della Francia?", "Parigi");

        // Mostra la domanda all’utente
        d1.mostraDomanda();

        // Inizializzazione dello scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tua risposta: ");
        String rispostaUtente = scanner.nextLine();

        // Verifica della risposta e output del risultato
        if (d1.verificaRisposta(rispostaUtente)) {
            System.out.println("Risposta corretta!");
        } else {
            System.out.println("Risposta sbagliata.");
        }

        // Chiusura dello scanner per evitare memory leaks
        scanner.close();
    }
}
