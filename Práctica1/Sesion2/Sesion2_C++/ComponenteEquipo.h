/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ComponenteEquipo.h
 * Author: super
 *
 * Created on 28 de febrero de 2020, 18:01
 */

#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

#include <string>

using namespace std;

class VisitanteEquipo;

class ComponenteEquipo {
public:
    ComponenteEquipo();
    ComponenteEquipo(const ComponenteEquipo& orig);
    virtual ~ComponenteEquipo();
    
    virtual void aceptarVisitante(VisitanteEquipo v) = 0;
    
     inline string getName() {return name;}
     inline float getPrecio() {return precio;}
     
     inline void setName(string name) {this->name = name;}
     inline void setPrecio(float precio) {this->precio = precio;}
     
protected:
    string name;
    float precio;
};

#endif /* COMPONENTEEQUIPO_H */

