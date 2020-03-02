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
#include <iostream>

VisitantePrecioDetalle::VisitantePrecioDetalle() {
}

VisitantePrecioDetalle::VisitantePrecioDetalle(const VisitantePrecioDetalle& orig) {
}

VisitantePrecioDetalle::VisitantePrecioDetalle(Categoria tipoCliente) {
    this->tipoCliente = tipoCliente;
}

void VisitantePrecioDetalle::ImprimirResultado() {
    list<ComponenteEquipo*>::iterator it;
    std::cout << "Precio detallado del equipo:";
    
    for (it = equipo.begin(); it != equipo.end(); it++) {
        std::cout << "\nComponente: " << (*it)->getName() << "\tPrecio: " << this->aplicaDescuento((*it)->getPrecio());
        this->precioAcumulado += this->aplicaDescuento((*it)->getPrecio());
    }
    
    std::cout << "\nPrecio total del equipo: " << this->precioAcumulado << std::endl;
}