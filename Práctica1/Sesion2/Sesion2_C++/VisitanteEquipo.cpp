/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitanteEquipo.cpp
 * Author: super
 * 
 * Created on 28 de febrero de 2020, 17:56
 */

#include "VisitanteEquipo.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"

#include <iostream>

VisitanteEquipo::VisitanteEquipo() {
}

VisitanteEquipo::VisitanteEquipo(const VisitanteEquipo& orig) {
}

VisitanteEquipo::VisitanteEquipo(Categoria tipoCliente) {
    this->tipoCliente = tipoCliente;
}

VisitanteEquipo::~VisitanteEquipo() {
}

void VisitanteEquipo::visitarBus(Bus &b){
    equipo.push_back(&b);
}

void VisitanteEquipo::visitarTarjeta(Tarjeta &t){
    equipo.push_back(&t);
}

void VisitanteEquipo::visitarDisco(Disco &d){
    equipo.push_back(&d);
}

float VisitanteEquipo::aplicaDescuento (float precioInicial) {
    float precioFinal = precioInicial - (precioInicial * this->tipoCliente / 100.0f); 
    return precioFinal;
}

