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
public class RepercutirRozamiento implements Filtro {
    
    double repercusion = 1;

    @Override
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        return revoluciones -= this.repercusion;
    }

}
