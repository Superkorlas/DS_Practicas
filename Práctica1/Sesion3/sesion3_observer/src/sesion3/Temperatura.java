/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.util.Observable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class Temperatura extends Observable implements Runnable {

    private double state;

    Temperatura() {
        state = 0.0f;
        this.run();
    }

    public double getState() {
        return state;
    }

    public void setState() {      
        this.state = Math.random() * 50 - 10;
        this.notifyObservers(this.state);
        System.out.println("Temperatura: " + this.state);
    }

    @Override
    public void run() {
        while (true) {
            this.setState();
            try {
                long interval = (long) Math.random() * 4 +1;
                Thread.sleep( interval * 5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Temperatura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
