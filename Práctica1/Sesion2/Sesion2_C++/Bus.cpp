/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Bus.cpp
 * Author: super
 * 
 * Created on 28 de febrero de 2020, 18:02
 */

#include "Bus.h"
#include "VisitanteEquipo.h"
#include <string>

Bus::Bus() {
}

Bus::Bus(const Bus& orig) {
}

Bus::~Bus() {
}

Bus::Bus(string name, float precio) {
    this->name = name;
    this->precio = precio;
}

void Bus::aceptarVisitante(VisitanteEquipo &v) {
    v.visitarBus(*this);
}

