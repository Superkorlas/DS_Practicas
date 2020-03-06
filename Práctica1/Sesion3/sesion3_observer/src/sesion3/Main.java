/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;


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
        PantallaTemperatura pantalla = new PantallaTemperatura(temperaturaObservable);
        BotonCambio boton = new BotonCambio(temperaturaObservable);
        GraficaTemperatura grafica  = new GraficaTemperatura(temperaturaObservable);
        temperaturaObservable.run();
    }  
}
