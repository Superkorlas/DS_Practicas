/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

/**
 *
 * @author jose
 */
public class GestorSCACV {
    
    EstadoSCACV estadoSCACV;
    float velocidadCrucero = 0;

    public GestorSCACV() {
        this.estadoSCACV = estadoSCACV.APAGADO;
    }

    public EstadoSCACV getEstadoSCACV() {
        return estadoSCACV;
    }

    public void setEstadoSCACV(EstadoSCACV estadoSCACV) {
        this.estadoSCACV = estadoSCACV;
    }
    
    public EstadoMotor ejecutar(double revoluciones, EstadoMotor estado) {
        EstadoMotor salida = estado;
        switch (this.estadoSCACV) {
            case MANTENIENDO:

                break;
            case REINICIANDO:

                break;
            case ACELERANDO:

                break;
        }
        return salida;

    }
    
}
