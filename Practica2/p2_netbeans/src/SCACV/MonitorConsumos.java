/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

import GUI.Salpicadero;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class MonitorConsumos {
    
    Salpicadero salpicadero;
    ConsumibleVehiculo gasolina;
    ConsumibleVehiculo aceite;
    ConsumibleVehiculo frenos;
    ConsumibleVehiculo general;
    
    public MonitorConsumos() {
        gasolina = new TanqueCombustible(1000);
        aceite = new ConsumibleVehiculo(5000000);
        frenos = new ConsumibleVehiculo(100000000);
        general = new ConsumibleVehiculo(1000000000);
    }

    public Salpicadero getSalpicadero() {
        return salpicadero;
    }

    public ConsumibleVehiculo getGasolina() {
        return gasolina;
    }

    public ConsumibleVehiculo getAceite() {
        return aceite;
    }

    public ConsumibleVehiculo getFrenos() {
        return frenos;
    }

    public ConsumibleVehiculo getGeneral() {
        return general;
    }
    
    public void calcular(double revoluciones, EstadoMotor estadoMotor) {
        gasolina.calcularConsumo(revoluciones, estadoMotor);
        aceite.calcularConsumo(revoluciones, estadoMotor);
        frenos.calcularConsumo(revoluciones, estadoMotor);
        general.calcularConsumo(revoluciones, estadoMotor);
    }
    
}