/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecioDetalle.h
 * Author: super
 *
 * Created on 29 de febrero de 2020, 12:42
 */

#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H

#include "VisitanteEquipo.h"

class VisitantePrecioDetalle : public VisitanteEquipo {
public:
    VisitantePrecioDetalle();
    VisitantePrecioDetalle(const VisitantePrecioDetalle& orig);
    VisitantePrecioDetalle(Categoria tipoCliente);
    
    void ImprimirResultado();
private:
    float precioAcumulado = 0;
};

#endif /* VISITANTEPRECIODETALLE_H */

