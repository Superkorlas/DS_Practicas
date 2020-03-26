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
public class TanqueCombustible extends ConsumibleVehiculo {

    public TanqueCombustible(double maximo) {
        super(maximo);
    }

    @Override
    public void calcularConsumo(double revoluciones, EstadoMotor estadoMotor) {
        this.clock.actualizaReloj();
        
        double revolucionesMedias = (revoluciones + this.revolucionesAnt) / 2;
        this.revolucionesAnt = revoluciones;
        double revolucionesDadas = (revolucionesMedias / 60) * this.clock.getDeltaTime();
        double gastoCombustible = revolucionesDadas * revolucionesDadas * 5 / 100000000000.0;

        this.actual -= gastoCombustible;

        this.actualizarEstado(estadoMotor);

    }
    
    

}
