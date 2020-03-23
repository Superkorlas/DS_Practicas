/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author jose
 */
public class ConsumibleVehiculo extends Observable implements Consumible {
    boolean alert;
    double MAX;
    double actual;
    ArrayList<Object> estado = new ArrayList<>();

    public ConsumibleVehiculo(double maximo) {
        alert = false;
        MAX = maximo;
        actual = MAX;
    }
    
    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        estado.clear();
        actual = actual - revoluciones*1000;
        alert = false;
        if (actual <= 0) {
            actual = 0;
            alert = true;
        }
         this.alertar(estadoMotor);
    }
    
    @Override
    public void reset() {
        actual = MAX;
    }
    
    public void alertar(EstadoMotor estadoMotor) {
        this.setChanged();
        estado.add(estadoMotor);
        estado.add(this.alert);
        this.notifyObservers(estado);
    }
    
    
}