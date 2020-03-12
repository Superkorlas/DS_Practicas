/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import java.text.DecimalFormat;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jose
 */
public class LabelObserver extends javax.swing.JLabel implements Observer{
    public LabelObserver() {
        super();
        this.setVisible(true);
    }
 
    @Override
    public void update(Observable o, Object arg) {
       DecimalFormat formato = new DecimalFormat("#.#");
       this.setText(formato.format(arg) + "º");
    }
}
