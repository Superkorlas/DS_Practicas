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
    PanelBotones controles;
    double revoluciones;
    
    AudiR8() {
        this.estado = EstadoMotor.APAGADO;
        this.revoluciones = 0.0;        
        this.gestorFiltros = new GestorFiltros();
        this.salpicadero = new Salpicadero();
        //this.controles = new PanelBotones(this);
        
        this.run();
    }

    public double getRevoluciones() {
        return this.revoluciones;
    }

    public void setEstado(EstadoMotor estado) {
        this.estado = estado;
    }
    
    public EstadoMotor getEstado() {
        return this.estado;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            this.revoluciones = gestorFiltros.ejecutar(this.revoluciones, this.estado);
            this.salpicadero.ejecutar(this.revoluciones, this.estado);
            System.out.println("Actualizando...");
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorFiltros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
