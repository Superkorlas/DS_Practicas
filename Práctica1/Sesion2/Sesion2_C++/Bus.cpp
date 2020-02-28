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

Bus::Bus() {
}

Bus::Bus(const Bus& orig) {
}

Bus::~Bus() {
}

void Bus::aceptarVisitante(VisitanteEquipo v) {
    v.visitarBus(*this);
}

