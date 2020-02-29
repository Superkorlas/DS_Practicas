/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Disco.h
 * Author: super
 *
 * Created on 28 de febrero de 2020, 18:02
 */

#ifndef DISCO_H
#define DISCO_H

#include "ComponenteEquipo.h"
#include <string>

class Disco : public ComponenteEquipo{
public:
    Disco();
    Disco(const Disco& orig);
    Disco(string name, float precio);
    virtual ~Disco();
    
    void aceptarVisitante(VisitanteEquipo v) override;
private:

};

#endif /* DISCO_H */

