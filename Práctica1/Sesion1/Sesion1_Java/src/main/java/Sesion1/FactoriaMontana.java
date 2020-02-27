package Sesion1;

public class FactoriaMontana extends FactoriaCarreraYBicicleta {

    @Override
    public CarreraMontana crearCarrera(int numBicicletas) {
        return new CarreraMontana(numBicicletas);
    }

    @Override
    public BicicletaMontana crearBicicleta() {
        return new BicicletaMontana();
    }

}
