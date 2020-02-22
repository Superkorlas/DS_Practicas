package Sesion1;

public class FactoriaCarretera extends FactoriaCarreraYBicicleta {

        @Override
	public CarreraCarretera crearCarrera() {
            return new CarreraCarretera();
	}

        @Override
	public BicicletaCarretera crearBicicleta() {
            return new BicicletaCarretera();
	}

}