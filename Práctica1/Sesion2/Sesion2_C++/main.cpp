/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: super
 *
 * Created on 27 de febrero de 2020, 17:17
 */

#include "cstdlib"
#include <iostream>
#include "ComponenteEquipo.h"
#include "VisitanteEquipo.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "VisitantePrecio.h"

using namespace std;
/*
struct equipo {
        Bus bus ; 
        Disco disco;
        Tarjeta tarjeta;
    };
    */

/*
 * 
 */
int main(int argc, char** argv) {
    ComponenteEquipo* bus = new Bus("bus1", 25);
    ComponenteEquipo* disco = new Disco("disco1", 150);
    ComponenteEquipo* tarjeta = new Tarjeta ("tarjeta1", 500);
    
    VisitanteEquipo* visitante = new VisitantePrecio();
    bus->aceptarVisitante(*visitante);
    disco->aceptarVisitante(*visitante);
    tarjeta->aceptarVisitante(*visitante);
    
    visitante->ImprimirResultado();
    
    return 0;
}

