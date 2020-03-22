/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class MonitorConsumos {
    
    Salpicadero salpicadero;
    Consumible gasolina;
    Consumible aceite;
    Consumible frenos;
    Consumible general;
    
    public MonitorConsumos() {
        gasolina = new TanqueCombustible();
        aceite = new ConsumiblesVehiculo(5000000);
        frenos = new ConsumiblesVehiculo(100000000);
        general = new ConsumiblesVehiculo(1000000000);
    }
    
    public void calcular(double revoluciones, EstadoMotor estadoMotor) {
        gasolina.calcularConsumo(revoluciones, estadoMotor);
        aceite.calcularConsumo(revoluciones, estadoMotor);
        frenos.calcularConsumo(revoluciones, estadoMotor);
        general.calcularConsumo(revoluciones, estadoMotor);
    }
    
}