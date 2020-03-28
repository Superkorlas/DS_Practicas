/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.Filtros;

import Car.EstadoMotor;
import java.util.ArrayList;

/**
 *
 * @author super
 */
public class CadenaFiltros {
    ArrayList<Filtro> filtros = new ArrayList<>();
    
    CadenaFiltros() {
        this.filtros.add(new CalcularVelocidad());
        this.filtros.add(new RepercutirRozamiento());
    }
    
    public double ejecutar(double revoluciones, EstadoMotor estado) {
        for(Filtro filtro : this.filtros) {
            revoluciones = filtro.ejecutar(revoluciones, estado);
        }
        return revoluciones;
    }
}
