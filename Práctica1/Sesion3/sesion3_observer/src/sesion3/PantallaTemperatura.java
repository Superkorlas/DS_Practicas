/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

/**
 *
 * @author super
 */
public class PantallaTemperatura extends JLabel implements Observer{
    public PantallaTemperatura() {
        super();
        System.out.println("Pantalla...");
    }
    
    public void addObservable(Observable temperatura) {
        temperatura.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setText(arg.toString());
    }
    
}
