/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.text.DecimalFormat;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class Temperatura extends Observable implements Runnable {

    private static float state;
    private float minimo;
    private float maximo;

    Temperatura() {
        state = 0.0f;
        minimo = -10;
        maximo = 40;
        //this.run();
    }

    public double getState() {
        return state;
    }

    public void setState() {
        this.state = (float) Math.random() * (maximo - minimo + 1) + minimo;
        this.setChanged();
        this.notifyObservers(this.state);
        System.out.println("Temperatura: " + this.state + "º");
    }

    public float getMinimo() {
        return minimo;
    }

    public float getMaximo() {
        return maximo;
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
