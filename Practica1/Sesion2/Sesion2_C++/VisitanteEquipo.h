/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitanteEquipo.h
 * Author: super
 *
 * Created on 28 de febrero de 2020, 17:55
 */

#ifndef VISITANTEEQUIPO_H
#define VISITANTEEQUIPO_H

#include <list>
#include "ComponenteEquipo.h"

using namespace std;

class Bus;
class Tarjeta;
class Disco;

enum Categoria {SIN_DESCUENTO = 0, ESTUDIANTE = 10, MAYORISTA = 15 };

class VisitanteEquipo {
public:
    VisitanteEquipo();
    VisitanteEquipo(const VisitanteEquipo& orig);
    VisitanteEquipo(Categoria tipoCliente);
    virtual ~VisitanteEquipo();
    
    virtual void visitarDisco(Disco &d);
    virtual void visitarTarjeta(Tarjeta &t);
    virtual void visitarBus(Bus &b);
    
    float aplicaDescuento (float precioInicial);
    
    virtual void ImprimirResultado() = 0;
protected:
    list<ComponenteEquipo*> equipo;
    Categoria tipoCliente = SIN_DESCUENTO;
};

#endif /* VISITANTEEQUIPO_H */

