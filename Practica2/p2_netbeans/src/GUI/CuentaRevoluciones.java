/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import eu.hansolo.steelseries.gauges.Radial;
import java.awt.BorderLayout;

/**
 *
 * @author alejandro
 */
public class CuentaRevoluciones extends Contador {
        
    /**
     * Creates new form CuentaRevoluciones
     */
    public CuentaRevoluciones() {
        super("Revoluciones", 5000);
    }
    
    public void actualiza(double revoluciones) {
        this.indicador.setValueAnimated(revoluciones);
        this.indicador.setUnitString(Double.toString(revoluciones));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(300, 100));
        setMinimumSize(new java.awt.Dimension(300, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
