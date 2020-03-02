/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecioDetalle.cpp
 * Author: super
 * 
 * Created on 29 de febrero de 2020, 12:42
 */

#include "VisitantePrecioDetalle.h"
#include <list>
#include <iterator>

VisitantePrecioDetalle::VisitantePrecioDetalle() {
}

VisitantePrecioDetalle::VisitantePrecioDetalle(const VisitantePrecioDetalle& orig) {
}

void VisitantePrecioDetalle::ImprimirResultado() {
    list<ComponenteEquipo*>::iterator it;
    string resultado = "";
    
    for (it = equipo.begin(); it != equipo.end(); it++) {
        this->precioAcumulado += (*it)->getPrecio();
    }
    
    
}