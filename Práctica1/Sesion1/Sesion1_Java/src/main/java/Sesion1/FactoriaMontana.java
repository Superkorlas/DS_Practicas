package Sesion1;


public class FactoriaMontana extends FactoriaCarreraYBicicleta {

        @Override
	public CarreraMontana crearCarrera() {
            return new CarreraMontana();
	}

        @Override
	public BicicletaMontana crearBicicleta() {
            return new BicicletaMontana();
	}

}