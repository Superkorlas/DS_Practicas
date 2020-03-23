/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author alejandro
 */
public class Clock {
    private double timeSinceStart = System.nanoTime() / 1000;
    private double oldTimeSinceStart = 0.0;
    public double deltaTime = 0.0;

    public double getDeltaTime() {
        return deltaTime;
    }
        
    public void actualizaReloj() {
        this.timeSinceStart = System.nanoTime() / 1000000000.0;
        this.deltaTime = this.timeSinceStart - this.oldTimeSinceStart;
        this.oldTimeSinceStart = this.timeSinceStart;
    }

}
