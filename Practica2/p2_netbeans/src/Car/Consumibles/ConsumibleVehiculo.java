/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.Consumibles;

import Car.EstadoMotor;
import Utils.Clock;
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
    protected Clock clock = new Clock();
    protected double revolucionesAnt = 0;

    public ConsumibleVehiculo(double maximo) {
        this.alert = false;
        this.MAX = maximo;
        this.actual = this.MAX;
    }
    
    public boolean isAlert() {
        return this.alert;
    }

    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        this.clock.actualizaReloj();

        double revolucionesMedias = (revoluciones + this.revolucionesAnt) / 2;
        this.revolucionesAnt = revoluciones;
        double revolucionesDadas = (revolucionesMedias / 60) * this.clock.getDeltaTime();

        this.actual -= revolucionesDadas;
        
        this.actualizarEstado(estadoMotor);

    }

    protected void actualizarEstado(EstadoMotor estadoMotor) {
        this.estado.clear();
        this.alert = false;
        if (this.actual <= 0) {
            this.actual = 0;
            this.alert = true;
        }
        this.alertar(estadoMotor);
    }

    @Override
    public void reset() {
        this.actual = this.MAX;
    }

    public void alertar(EstadoMotor estadoMotor) {
        this.setChanged();
        this.estado.add(estadoMotor);
        this.estado.add(this.alert);
        this.notifyObservers(this.estado);
    }

}
