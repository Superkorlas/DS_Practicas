/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Equipo.cpp
 * Author: super
 * 
 * Created on 5 de marzo de 2020, 15:52
 */

#include "Equipo.h"
#include "Bus.h"
#include "Disco.h"
#include "Tarjeta.h"
#include "VisitanteEquipo.h"
#include "ComponenteEquipo.h"

Equipo::Equipo(float precioBus, float precioDisco, float precioTarjeta) {
    bus = new Bus("Bus", precioBus);
    disco = new Disco("Disco", precioDisco);
    tarjeta = new Tarjeta("Tarjeta", precioTarjeta);
}

Equipo::Equipo(const Equipo& orig) {
}

Equipo::~Equipo() {
}

void Equipo::aceptarVisitante(VisitanteEquipo &visitante) {
    bus->aceptarVisitante(visitante);
    disco->aceptarVisitante(visitante);
    tarjeta->aceptarVisitante(visitante);
}

