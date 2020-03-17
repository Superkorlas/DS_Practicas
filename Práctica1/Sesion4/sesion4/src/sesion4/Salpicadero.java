/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;

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
    double radioEje = 0.15;
    
    /**
     * Creates new form Salpicadero
     */
    public Salpicadero() {
        initComponents();
        this.setSize(300, 600);
        this.setResizable(false);
        
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
        
        // No estoy seguro, no se ejecuta
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {System.out.println("jeje"); System.exit(0);}
        });
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        double velocidad = this.velocimetro.actualiza(revoluciones, this.radioEje);
        this.cuentaKilometros.actualizar(velocidad);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
