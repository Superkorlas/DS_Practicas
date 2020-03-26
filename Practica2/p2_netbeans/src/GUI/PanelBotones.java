/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import SCACV.AudiR8;
import SCACV.EstadoMotor;
import java.awt.Color;

/**
 *
 * @author jose
 */
public class PanelBotones extends javax.swing.JPanel {
 AudiR8 coche;
    
    /**
     * Creates new form PanelBotones
     */
    public PanelBotones(AudiR8 coche) {
        initComponents();
        this.coche = coche;
        this.parametrosIniciales();
        this.actualizaInterfaz();
    }
    
    public void actualizaInterfaz() {
        // estado del SCACV tiene prioridad sobre estadoMotor, solo mostrar estadoMotor si SCACV apagado
        this.EtiqMostrarEstado.setText(this.coche.getEstado().toString());
        
        if(this.BotonEncender.isSelected()){
            this.BotonEncender.setForeground(Color.red);
        } else {
            this.BotonEncender.setForeground(Color.green);
        }
        
        if(this.BotonAcelerar.isSelected()){
            this.BotonAcelerar.setForeground(Color.red);
        } else {
            this.BotonAcelerar.setForeground(Color.black);
        }
        
        if(this.BotonFrenar.isSelected()){
            this.BotonFrenar.setForeground(Color.red);
        } else {
            this.BotonFrenar.setForeground(Color.black);
        }
    }
    
    public void actualizarEstado(Boolean sinGasolina) {
        if (sinGasolina) {
            this.parametrosIniciales();
        }
        this.BotonEncender.setEnabled(!sinGasolina);
        this.actualizaInterfaz();
    }
    
    public void parametrosIniciales() {
        this.EtiqMostrarEstado.setForeground(Color.red);
        this.BotonAcelerar.setText("ACELERAR");
        this.BotonAcelerar.setSelected(false);
        this.BotonFrenar.setText("FRENAR");
        this.BotonFrenar.setSelected(false);
        this.BotonEncender.setText("ENCENDER");
        this.BotonEncender.setSelected(false);
        this.BotonEncender.setForeground(Color.green);
    }
    
    /**
     * Creates new form PanelBotones
     */
    public PanelBotones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EtiqMostrarEstado = new javax.swing.JLabel();
        BotonEncender = new javax.swing.JToggleButton();
        BotonAcelerar = new javax.swing.JToggleButton();
        BotonFrenar = new javax.swing.JToggleButton();
        BotonMantener = new javax.swing.JToggleButton();
        BotonReiniciar = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(387, 266));

        EtiqMostrarEstado.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EtiqMostrarEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiqMostrarEstado.setText("jLabel1");

        BotonEncender.setText("encender/apagar");
        BotonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEncenderActionPerformed(evt);
            }
        });

        BotonAcelerar.setText("acelerar");
        BotonAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAcelerarActionPerformed(evt);
            }
        });

        BotonFrenar.setText("frenar");
        BotonFrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFrenarActionPerformed(evt);
            }
        });

        BotonMantener.setText("SCACV mantener");
        BotonMantener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMantenerActionPerformed(evt);
            }
        });

        BotonReiniciar.setText("SCACV reiniciar");

        jToggleButton1.setText("SCACV acelelarar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiqMostrarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonAcelerar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                        .addComponent(BotonMantener))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonFrenar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotonReiniciar)))))
                        .addGap(55, 55, 55)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(BotonEncender)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EtiqMostrarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonEncender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMantener))
                .addGap(1, 1, 1)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonReiniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEncenderActionPerformed
        if (this.coche.getEstado() == EstadoMotor.APAGADO) {
            this.coche.setEstado(EstadoMotor.ENCENDIDO);
            this.BotonEncender.setText("APAGAR");
        } else {
            this.coche.setEstado(EstadoMotor.APAGADO);
            this.BotonEncender.setText("ENCENDER");
            this.BotonAcelerar.setText("ACELERAR");
            this.BotonFrenar.setText("FRENAR");
            this.BotonMantener.setSelected(false);
            this.BotonAcelerar.setSelected(false);
            this.BotonFrenar.setSelected(false);
        }
        this.actualizaInterfaz();
    }//GEN-LAST:event_BotonEncenderActionPerformed
     
    private void BotonAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAcelerarActionPerformed
        switch(this.coche.getEstado()) {
            case ACELERANDO:
            this.coche.setEstado(EstadoMotor.ENCENDIDO);
            this.BotonAcelerar.setText("ACELERAR");
            break;
            case FRENANDO:
            this.BotonFrenar.setText("FRENAR");
            this.BotonFrenar.setSelected(false);
            case ENCENDIDO:
            this.coche.setEstado(EstadoMotor.ACELERANDO);
            this.BotonAcelerar.setText("Soltar acelerador");
            break;
            case APAGADO:
            this.BotonAcelerar.setSelected(false);
            break;
        }
        this.actualizaInterfaz();
    }//GEN-LAST:event_BotonAcelerarActionPerformed

    private void BotonFrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFrenarActionPerformed
        switch(this.coche.getEstado()) {
            case FRENANDO:
            this.coche.setEstado(EstadoMotor.ENCENDIDO);
            this.BotonFrenar.setText("FRENAR");
            break;
            case ACELERANDO:
            this.BotonAcelerar.setText("ACELERAR");
            this.BotonAcelerar.setSelected(false);
            case ENCENDIDO:
            this.coche.setEstado(EstadoMotor.FRENANDO);
            this.BotonFrenar.setText("Soltar freno");
            break;
            case APAGADO:
            this.BotonFrenar.setSelected(false);
            break;
        }
        this.actualizaInterfaz();
    }//GEN-LAST:event_BotonFrenarActionPerformed

    private void BotonMantenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMantenerActionPerformed

        this.actualizaInterfaz();
    }//GEN-LAST:event_BotonMantenerActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        System.exit(0);
    }                            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonAcelerar;
    private javax.swing.JToggleButton BotonEncender;
    private javax.swing.JToggleButton BotonFrenar;
    private javax.swing.JToggleButton BotonMantener;
    private javax.swing.JToggleButton BotonReiniciar;
    private javax.swing.JLabel EtiqMostrarEstado;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
