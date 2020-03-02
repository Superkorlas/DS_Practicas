/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Bus.h
 * Author: super
 *
 * Created on 28 de febrero de 2020, 18:02
 */

#ifndef BUS_H
#define BUS_H

#include "ComponenteEquipo.h"
#include <string>

class Bus : public ComponenteEquipo{
public:
    Bus();
    Bus(const Bus& orig);
    Bus(string name, float precio);
    virtual ~Bus();
    
    void aceptarVisitante(VisitanteEquipo &v) override;
private:

};

#endif /* BUS_H */

