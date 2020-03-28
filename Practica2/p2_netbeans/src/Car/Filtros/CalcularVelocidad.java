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
public class CalcularVelocidad  implements Filtro {
    
    final double VARIACION = 100;
    final double MAX_REVOLUCIONES = 5000;
    final double MIN_REVOLUCIONES = 0;
    
    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        switch(estadoMotor) {
            case ACELERANDO:
                revoluciones += this.VARIACION;
                break;
            case FRENANDO:
                revoluciones -= this.VARIACION;
                break;
            case APAGADO:
                revoluciones = this.MIN_REVOLUCIONES;
                break;
        }
        if (revoluciones > this.MAX_REVOLUCIONES) {
            revoluciones = this.MAX_REVOLUCIONES;
        } else if (revoluciones <= this.MIN_REVOLUCIONES) {
            revoluciones = this.MIN_REVOLUCIONES;
        }
        return revoluciones;
    }
    
}
