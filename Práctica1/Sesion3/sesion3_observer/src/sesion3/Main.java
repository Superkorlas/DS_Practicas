/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import javax.swing.SwingUtilities;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatura temperaturaObservable = new Temperatura();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().start();
            }
        });
    }
    private void start() {
        PantallaTemperatura pantallaTempertatura = new PantallaTemperatura();
    }
    
}
