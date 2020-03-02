/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecio.h
 * Author: super
 *
 * Created on 29 de febrero de 2020, 12:41
 */

#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H

#include "VisitanteEquipo.h"

class VisitantePrecio : public VisitanteEquipo{
public:
    VisitantePrecio();
    VisitantePrecio(const VisitantePrecio& orig);
    VisitantePrecio(Categoria tipoCliente);

    virtual void visitarDisco(Disco &d);
    virtual void visitarTarjeta(Tarjeta &t);
    virtual void visitarBus(Bus &b);
    
     void ImprimirResultado() override;
protected:
    float precioAcumulado = 0;
};

#endif /* VISITANTEPRECIO_H */

