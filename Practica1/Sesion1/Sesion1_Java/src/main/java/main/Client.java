/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import Sesion1.*;

/**
 *
 * @author super
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("Indica el numero de bicicletas por carrera: ");
        Scanner input = new Scanner(System.in);
        int numeroBicicletas = input.nextInt();
        FactoriaCarreraYBicicleta factoria;

        //Carrera de carretera
        factoria = new FactoriaCarretera();
        Carrera carreraCarretera = factoria.crearCarrera(numeroBicicletas);
        //System.out.println("Carrera de carretera:\n" + carreraCarretera.toString());

        //Carrera de montana
        factoria = new FactoriaMontana();
        Carrera carreraMontana = factoria.crearCarrera(numeroBicicletas);
        //System.out.println("Carrera de montana:\n" + carreraMontana.toString());
    }
}
