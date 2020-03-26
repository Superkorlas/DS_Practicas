package Sesion1;

import java.util.logging.Level;
import java.util.logging.Logger;



public abstract class Bicicleta extends Thread {
    private int dorsal = 0;
    private float duracionCarrera = 0;
    private boolean abandonaCarrera = false;
    
    public void prepararParaCarrera(int dorsal, float duracionCarrera) {
        this.dorsal = dorsal;
        this.duracionCarrera = duracionCarrera;
    }

    public int getDorsal() {
        return dorsal;
    }

    public boolean abandonaCarrera() {
        return abandonaCarrera;
    }
    
    public void abandonarCarrera(float momentoAbandono) {
        this.abandonaCarrera = true;
        this.duracionCarrera = momentoAbandono;
    }
    
    @Override
    public void run() {
        try {
            System.out.println(this.toString() + " comienza la carrera.");
            this.sleep((long)duracionCarrera * 1000);   
            if (abandonaCarrera) {
                System.out.println(this.toString() + " abandona la carrera.");
            } else {
                System.out.println(this.toString() + " finaliza la carrera.");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Bicicleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "dorsal=" + dorsal + "} ";
    }
        
        
}