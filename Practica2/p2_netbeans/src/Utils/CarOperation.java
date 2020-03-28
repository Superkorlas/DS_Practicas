/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;




/**
 *
 * @author alejandro
 */
public class CarOperation {
    public static double velocidad(double revoluciones, double radioEje) {
        double velocidad = 2*3.141592 * radioEje * revoluciones * 0.06;
        return velocidad;
    }
}
