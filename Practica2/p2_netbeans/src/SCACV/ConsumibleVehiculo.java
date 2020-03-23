/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

import java.util.Observable;

/**
 *
 * @author jose
 */
public class ConsumibleVehiculo extends Observable implements Consumible {
    boolean alert;
    double MAX;
    double actual;

    public ConsumibleVehiculo(double maximo) {
        alert = false;
        MAX = maximo;
        actual = MAX;
    }
    
    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        actual = actual - revoluciones*1000;
        if (actual <= 0) {
            actual = 0;
            this.alertar();
        }
    }
    
    @Override
    public void reset() {
        actual = MAX;
    }
    
    public void alertar() {
        System.out.println("Alertando");
        this.setChanged();
        this.notifyObservers();
    }
    
    
}