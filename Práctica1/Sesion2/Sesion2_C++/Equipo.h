/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Equipo.h
 * Author: super
 *
 * Created on 5 de marzo de 2020, 15:52
 */

#ifndef EQUIPO_H
#define EQUIPO_H

class ComponenteEquipo;
class VisitanteEquipo;

class Equipo {
public:
    Equipo(float precioBus, float precioDisco, float precioTarjeta);
    Equipo(const Equipo& orig);
    virtual ~Equipo();
    
    void aceptarVisitante(VisitanteEquipo &visitante);
private:
    ComponenteEquipo* bus;
    ComponenteEquipo* disco;
    ComponenteEquipo* tarjeta;

};

#endif /* EQUIPO_H */

