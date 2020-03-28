/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.Consumibles;

import Car.EstadoMotor;

/**
 *
 * @author jose
 */
public interface Consumible {
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor);
    public void reset();
}
