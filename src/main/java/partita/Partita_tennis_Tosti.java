/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package partita;

/**
 *
 * @author Gabriele Tosti
 */
public class Partita_tennis_Tosti {

    public static void main(String[] args) {
        // Creo i due giocatori
        Giocatore giocatore1 = new Giocatore("Giocatore1");
        Giocatore giocatore2 = new Giocatore("Giocatore2");

        // Avvio i thread
        giocatore1.start();
        giocatore2.start();

        try {
            // Attende che entrambi i thread terminino
            giocatore1.join();
            giocatore2.join();
        } catch (InterruptedException e) {
            System.out.println("Errore: "+ e);
        }

        System.out.println("Partita terminata!");
    }
}
