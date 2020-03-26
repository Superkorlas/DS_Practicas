/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class GestorFiltros extends Thread {

    CadenaFiltros filtros;

    GestorFiltros() {
        this.filtros = new CadenaFiltros();
    }
    
    public double ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        return this.filtros.ejecutar(revoluciones, estadoMotor);
    }
}
