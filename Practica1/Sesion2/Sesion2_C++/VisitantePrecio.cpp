/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecio.cpp
 * Author: super
 * 
 * Created on 29 de febrero de 2020, 12:41
 */

#include "VisitantePrecio.h"
#include "ComponenteEquipo.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"
#include <iostream>
#include <list>
#include <iterator>

VisitantePrecio::VisitantePrecio() {
}

VisitantePrecio::VisitantePrecio(const VisitantePrecio& orig) {
}

VisitantePrecio::VisitantePrecio(Categoria tipoCliente) {
    this->tipoCliente = tipoCliente;
}

void VisitantePrecio::visitarBus(Bus &b){
    this->precioAcumulado += this->aplicaDescuento(b.getPrecio());
}

void VisitantePrecio::visitarTarjeta(Tarjeta &t){
    this->precioAcumulado += this->aplicaDescuento(t.getPrecio());
}

void VisitantePrecio::visitarDisco(Disco &d){
    this->precioAcumulado += this->aplicaDescuento(d.getPrecio());
}

void VisitantePrecio::ImprimirResultado() {   
    /*  Si usara los métodos visitarBus, visitarDisco y visitarTarjeta de clase padre
    list<ComponenteEquipo*>::iterator it;
    
    for (it = equipo.begin(); it != equipo.end(); it++) {
        this->precioAcumulado += (*it)->getPrecio();
    }
    */
    std::cout << "Precio del equipo: "  << this->precioAcumulado << std::endl;
}

