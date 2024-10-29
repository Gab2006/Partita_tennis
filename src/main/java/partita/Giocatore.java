/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partita;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriele Tosti
 */
public class Giocatore extends Thread {
    private String nome;
    public Giocatore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // Simuliamo 10 scambi
            System.out.println("ping - " + nome);
            try {
                this.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }
            Thread.yield();
        }
    }
}
