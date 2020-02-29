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

class Bus;
class Tarjeta;
class Disco;

class VisitanteEquipo {
public:
    VisitanteEquipo();
    VisitanteEquipo(const VisitanteEquipo& orig);
    virtual ~VisitanteEquipo();
    
    virtual void visitarDisco(Disco d);
    virtual void visitarTarjeta(Tarjeta t);
    virtual void visitarBus(Bus b);
    
    virtual void ImprimirResultado();
protected:
};

#endif /* VISITANTEEQUIPO_H */

