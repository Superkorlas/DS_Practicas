/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.Filtros;

import Car.EstadoMotor;

/**
 *
 * @author super
 */
public interface Filtro {
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor);
}
