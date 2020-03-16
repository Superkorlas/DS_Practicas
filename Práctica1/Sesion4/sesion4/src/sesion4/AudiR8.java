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
public class AudiR8 extends Thread {

    GestorFiltros gestorFiltros;
    Salpicadero salpicadero;
    EstadoMotor estado;
    double revoluciones;
    final double maxRevoluciones;

    AudiR8() {
        this.gestorFiltros = new GestorFiltros();
        this.salpicadero = new Salpicadero();
        this.estado = EstadoMotor.APAGADO;
        this.revoluciones = 0.0;
        this.maxRevoluciones = 500;
        
        this.run();
    }

    public double getRevoluciones() {
        return this.revoluciones;
    }

    public void setEstado(EstadoMotor estado) {
        this.estado = estado;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            this.revoluciones = gestorFiltros.ejecutar(this.revoluciones, this.estado);
            try {
                this.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorFiltros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
