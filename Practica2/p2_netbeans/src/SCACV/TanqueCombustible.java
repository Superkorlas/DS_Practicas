/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

/**
 *
 * @author jose
 */
public class TanqueCombustible implements Consumible {
    
    double MAX = 1000;
    
    double actual = MAX;

    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        this.actual = this.actual - revoluciones * 0.1;
    }
    
    @Override
    public void reset() {
        this.actual = this.MAX;
    }
    
}
