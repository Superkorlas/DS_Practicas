/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import Car.Consumibles.MonitorConsumos;
import Car.Filtros.GestorFiltros;
import Car.SCACV.GestorSCACV;
import GUI.Salpicadero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author super
 */
public class AudiR8 extends Thread {

    GestorFiltros gestorFiltros;
    MonitorConsumos monitorConsumos;
    Salpicadero salpicadero;
    EstadoMotor estado;
    GestorSCACV SCACV;
    double revoluciones;
    boolean reiniciando = false;
    
    public AudiR8() {
        this.SCACV = new GestorSCACV();
        this.estado = EstadoMotor.APAGADO;
        this.revoluciones = 0.0;        
        this.gestorFiltros = new GestorFiltros();
        this.monitorConsumos = new MonitorConsumos();
        this.salpicadero = new Salpicadero(this, this.monitorConsumos);
        
        this.run();
    }

    public GestorSCACV getSCACV() {
        return SCACV;
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
            this.estado = SCACV.ejecutar(this.revoluciones, this.estado);
            this.revoluciones = gestorFiltros.ejecutar(this.revoluciones, this.estado);
            this.monitorConsumos.calcular(this.revoluciones, this.estado);
            this.salpicadero.ejecutar(this.revoluciones, this.estado);
            if (this.monitorConsumos.getGasolina().isAlert()) {
                this.setEstado(EstadoMotor.APAGADO);
            }
            this.salpicadero.getControles().actualizarEstado(this.monitorConsumos.getGasolina().isAlert());
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorFiltros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
