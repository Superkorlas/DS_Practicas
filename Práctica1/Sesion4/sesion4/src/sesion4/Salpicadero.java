/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion4;


/**
 *
 * @author super
 */
public class Salpicadero extends javax.swing.JFrame
{
    CuentaRevoluciones cuentaRevoluciones = new CuentaRevoluciones();
    
    /**
     * Creates new form Salpicadero
     */
    public Salpicadero() {
        initComponents();
        this.setSize(300, 600);
        this.setResizable(false);
        
        
        this.getContentPane().add(this.cuentaRevoluciones);
        this.cuentaRevoluciones.setBounds(0, 400, 300, 100);
        

        this.setVisible(true);
    }
    
    public void ejecutar(double revoluciones, EstadoMotor estadoMotor) {
        //this.revoluciones.setText(Double.toString(revoluciones));
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
