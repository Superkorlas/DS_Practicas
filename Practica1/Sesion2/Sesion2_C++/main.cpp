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
#include "VisitanteEquipo.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"
#include "Equipo.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    Equipo* equipo = new Equipo(25, 150, 250);
    Equipo* equipo2 = new Equipo(12,12,12);
    
    VisitanteEquipo* visitantePrecio = new VisitantePrecio(SIN_DESCUENTO);
    equipo->aceptarVisitante(*visitantePrecio);
    visitantePrecio->ImprimirResultado();
    
    VisitanteEquipo* visitantePrecioDetallado = new VisitantePrecioDetalle(ESTUDIANTE);
    equipo->aceptarVisitante(*visitantePrecioDetallado);
    visitantePrecioDetallado->ImprimirResultado();
    
    VisitanteEquipo* visitantePrecioDetallado2 = new VisitantePrecioDetalle(MAYORISTA);
    equipo->aceptarVisitante(*visitantePrecioDetallado2);
    visitantePrecioDetallado2->ImprimirResultado();
    
    std::cout <<"----------------------" << std::endl;
    equipo2->aceptarVisitante(*visitantePrecio);
    visitantePrecio->ImprimirResultado();

    
    return 0;
}

