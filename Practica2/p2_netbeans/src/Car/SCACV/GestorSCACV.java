/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car.SCACV;

import Car.EstadoMotor;

/**
 *
 * @author jose
 */
public class GestorSCACV {
    
    EstadoSCACV estadoSCACV;
    double velocidadCrucero = 0;
    boolean velocidadGuardada = false;

    public GestorSCACV() {
        this.estadoSCACV = estadoSCACV.APAGADO;
    }

    public EstadoSCACV getEstadoSCACV() {
        return estadoSCACV;
    }
    
    public double getVelocidadCrucero() {
        return this.velocidadCrucero;
    }

    public void setEstadoSCACV(EstadoSCACV estadoSCACV) {
        this.estadoSCACV = estadoSCACV;
    }
    
    public EstadoMotor ejecutar(double revoluciones, EstadoMotor estado) {
        EstadoMotor salida = estado;
        switch (this.estadoSCACV) {
            case MANTENIENDO:
                if (!this.velocidadGuardada) {
                    this.velocidadCrucero = revoluciones;
                    this.velocidadGuardada = true;
                }
                salida = this.ajustarVelocidad(revoluciones);
                break;
            case REINICIANDO:
                salida = this.ajustarVelocidad(revoluciones);
                if ((revoluciones - this.velocidadCrucero) <= 100) {
                    this.estadoSCACV = EstadoSCACV.MANTENIENDO;
                    this.velocidadGuardada = true;
                }
                break;
            case ACELERANDO:
                salida = EstadoMotor.ACELERANDO;
                break;
            case APAGADO:
                this.velocidadGuardada = false;
                if (estado == EstadoMotor.APAGADO)
                    this.velocidadCrucero = 0.0;
                break;
        }
        return salida;

    }
    
    public EstadoMotor ajustarVelocidad(double revoluciones) {
        if (this.velocidadCrucero >= revoluciones) {
            return EstadoMotor.ACELERANDO;
        } else {
            return EstadoMotor.FRENANDO;
        }
    }
    
}
