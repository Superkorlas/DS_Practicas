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
    TanqueCombustible gasolina;
    ConsumibleVehiculo aceite;
    ConsumibleVehiculo frenos;
    ConsumibleVehiculo general;
    
    public MonitorConsumos() {
        gasolina = new TanqueCombustible();
        aceite = new ConsumibleVehiculo(5000000);
        frenos = new ConsumibleVehiculo(100000000);
        general = new ConsumibleVehiculo(1000000000);
    }
    
    public void calcular(double revoluciones, EstadoMotor estadoMotor) {
        gasolina.calcularConsumo(revoluciones, estadoMotor);
        aceite.calcularConsumo(revoluciones, estadoMotor);
        frenos.calcularConsumo(revoluciones, estadoMotor);
        general.calcularConsumo(revoluciones, estadoMotor);
    }
    
}