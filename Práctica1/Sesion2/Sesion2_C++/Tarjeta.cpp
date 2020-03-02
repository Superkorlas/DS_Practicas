/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Tarjeta.cpp
 * Author: super
 * 
 * Created on 28 de febrero de 2020, 18:02
 */

#include "Tarjeta.h"
#include "VisitanteEquipo.h"

Tarjeta::Tarjeta() {
}

Tarjeta::Tarjeta(const Tarjeta& orig) {
}

Tarjeta::Tarjeta(string name, float precio) {
    this->name = name;
    this->precio = precio;
}

Tarjeta::~Tarjeta() {
}

void Tarjeta::aceptarVisitante(VisitanteEquipo &v) {
    v.visitarTarjeta(*this);
}
