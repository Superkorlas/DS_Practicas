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
public class ConsumiblesVehiculo extends Observable implements Consumible {
    boolean alert;
    double MAX;
    double actual;

    public ConsumiblesVehiculo(double maximo) {
        alert = false;
        MAX = maximo;
        actual = MAX;
    }
    
    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        actual = actual - revoluciones * 0.1;
    }
    
    public void reset() {
        actual = MAX;
    }
    
    
}