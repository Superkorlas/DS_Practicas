/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SCACV;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jose
 */
public class ControlConsumible extends javax.swing.JPanel implements Observer {

    ConsumibleVehiculo consumible;
    
    public ControlConsumible(ConsumibleVehiculo consumible, String name) {
        initComponents();
        this.consumible = consumible;
        this.jLabel1.setText(name);
        this.jButton1.setText("Cambio de " + name);
        this.luzAviso.setSelected(false);
        this.jButton1.setEnabled(false);
        this.setVisible(true);
        consumible.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        luzAviso = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Aceite");

        luzAviso.setText("Estado");
        luzAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzAvisoActionPerformed(evt);
            }
        });

        jButton1.setText("Cambio de aceite");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(luzAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luzAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void luzAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzAvisoActionPerformed
        this.luzAviso.setSelected(!this.luzAviso.isSelected()); // Para que no haga nada al pulsarlo
    }//GEN-LAST:event_luzAvisoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.luzAviso.setSelected(false);
       this.consumible.reset();
       this.jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox luzAviso;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        boolean alert = (boolean) ((ArrayList<Object>)arg).get(1);
        if (alert) {
            this.luzAviso.setSelected(true);
            EstadoMotor estado = (EstadoMotor) ((ArrayList<Object>)arg).get(0);
            if (estado == EstadoMotor.APAGADO) {
                this.jButton1.setEnabled(true);
            }
        }
    }
}
