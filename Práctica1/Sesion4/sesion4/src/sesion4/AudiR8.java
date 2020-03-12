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

    AudiR8() {
         gestorFiltros = new GestorFiltros();
        salpicadero = new Salpicadero();
        estado = EstadoMotor.APAGADO;
        revoluciones = 0.0;
        this.run();
    }

    public double getRevoluciones() {
        return revoluciones;
    }

    public void setEstado(EstadoMotor estado) {
        this.estado = estado;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            revoluciones = gestorFiltros.ejecutar(revoluciones, estado);
            try {
                this.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorFiltros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
