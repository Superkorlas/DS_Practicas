/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Tarjeta.h
 * Author: super
 *
 * Created on 28 de febrero de 2020, 18:02
 */

#ifndef TARJETA_H
#define TARJETA_H

#include "ComponenteEquipo.h"
#include <string>

class Tarjeta : public ComponenteEquipo{
public:
    Tarjeta();
    Tarjeta(const Tarjeta& orig);
    Tarjeta(string name, float precio);
    virtual ~Tarjeta();
    
    void aceptarVisitante(VisitanteEquipo v) override;
private:

};

#endif /* TARJETA_H */

