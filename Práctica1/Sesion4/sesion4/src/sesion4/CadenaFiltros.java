/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

import java.util.ArrayList;

/**
 *
 * @author super
 */
public class CadenaFiltros {
    ArrayList<Filtro> filtros = new ArrayList<>();
    
    CadenaFiltros() {
        filtros.add(new CalcularVelocidad());
        filtros.add(new RepercutirRozamiento());
    }
    
    public double ejecutar(double revoluciones, EstadoMotor estado) {
        for(Filtro filtro : filtros) {
            revoluciones = filtro.ejecutar(revoluciones, estado);
        }
        return revoluciones;
    }
}
