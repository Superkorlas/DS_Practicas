/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Disco.cpp
 * Author: super
 * 
 * Created on 28 de febrero de 2020, 18:02
 */

#include "Disco.h"
#include "VisitanteEquipo.h"
#include <iostream>

Disco::Disco() {
}

Disco::Disco(const Disco& orig) {
}

Disco::Disco(string name, float precio) {
    this->name = name;
    this->precio = precio;
}

Disco::~Disco() {
}

void Disco::aceptarVisitante(VisitanteEquipo &v) {
    v.visitarDisco(*this);
}
