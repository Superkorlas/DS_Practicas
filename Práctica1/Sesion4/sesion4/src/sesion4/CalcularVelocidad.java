/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;


/**
 *
 * @author super
 */
public class CalcularVelocidad  implements Filtro {
    
    double variacion = 100;
    
    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        switch(estadoMotor) {
            case ACELERANDO:
                revoluciones += this.variacion;
                break;
            case FRENANDO:
                revoluciones -= this.variacion;
                break;
            case APAGADO:
                revoluciones = 0;
                break;
        }
        
        return revoluciones;
    }
    
}
