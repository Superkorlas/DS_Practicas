/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SCACV.AudiR8;
import SCACV.EstadoMotor;
import SCACV.MonitorConsumos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 *
 * @author super
 */
public class Salpicadero extends javax.swing.JFrame
{
    Velocimetro velocimetro = new Velocimetro();
    CuentaKilometros cuentaKilometros = new CuentaKilometros();
    CuentaRevoluciones cuentaRevoluciones = new CuentaRevoluciones();
    ControlConsumibles controlConsumibles;
    double radioEje = 0.15;
    PanelBotones controles;

    public PanelBotones getControles() {
        return controles;
    }
    
    
    
    /**
     * Creates new form Salpicadero
     */
    public Salpicadero(AudiR8 coche, MonitorConsumos consumos) {
        
        initComponents();
        this.setSize(687, 600);
        this.setResizable(false);
        this.controles = new PanelBotones(coche);
        this.controlConsumibles = new ControlConsumibles(consumos);
        
        // Añadimos el panel botones
        this.getContentPane().add(this.controles);
        this.controles.setBounds(300, 0, 387, 166);  
        
        //Añadimos el control de consumibles
        this.getContentPane().add(this.controlConsumibles);
        this.controlConsumibles.setBounds(300, 166, 387, 500);   
        
        //Añadimos el velocimetro
        this.getContentPane().add(this.velocimetro);
        this.velocimetro.setBounds(0, 0, 300, 100);
        
        //Añadimos el cuenta kilometros
        this.getContentPane().add(this.cuentaKilometros);
        this.cuentaKilometros.setBounds(0, 200, 300, 160);
        
        //Añadimos el cuentarrevoluciones
        this.getContentPane().add(this.cuentaRevoluciones);
        this.cuentaRevoluciones.setBounds(0, 400, 300, 100);
        

        this.setVisible(true);
        
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        double velocidad = this.velocimetro.actualiza(revoluciones, this.radioEje);
        this.cuentaKilometros.actualizar(velocidad, estadoMotor);
        this.cuentaRevoluciones.actualiza(revoluciones);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
