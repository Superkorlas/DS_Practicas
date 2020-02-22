package Sesion1;

import java.util.ArrayList;


public abstract class Carrera {
    protected ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    
    public void anadirBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            bicicletas.add(bicicleta);
            bicicleta.SetID(bicicletas.size());
        }
    }

    @Override
    public String toString() {
        return "Carrera{" + "bicicletas=" + bicicletas + '}';
    }
    
    
}