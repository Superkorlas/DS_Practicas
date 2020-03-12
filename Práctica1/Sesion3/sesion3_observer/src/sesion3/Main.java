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
        TemperaturaAndalucia temperaturaObservableAnd = new TemperaturaAndalucia();
        TemperaturaGalicia temperaturaObservableGal = new TemperaturaGalicia();
        
        MapaMeteorologico mapa = new MapaMeteorologico(temperaturaObservable, temperaturaObservableAnd, temperaturaObservableGal);
        PantallaTemperatura pantalla = new PantallaTemperatura(temperaturaObservable);
        BotonCambio boton = new BotonCambio(temperaturaObservable);
        GraficaTemperatura grafica  = new GraficaTemperatura(temperaturaObservable);
     
        System.out.println("Antes de run");
        temperaturaObservable.start();
        System.out.println("Entre run 1 y 2");
        temperaturaObservableAnd.start();
        System.out.println("Entre run 2 y 3");
        temperaturaObservableGal.start();
        System.out.println("Entre run 3 y 4");
        pantalla.start();
        System.out.println("Todas las thread running");
    }  
}
