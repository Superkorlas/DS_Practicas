package Sesion1;

public class FactoriaCarretera extends FactoriaCarreraYBicicleta {

    @Override
    public CarreraCarretera crearCarrera(int numBicicletas) {
        return new CarreraCarretera(numBicicletas);
    }

    @Override
    public BicicletaCarretera crearBicicleta() {
        return new BicicletaCarretera();
    }

}
