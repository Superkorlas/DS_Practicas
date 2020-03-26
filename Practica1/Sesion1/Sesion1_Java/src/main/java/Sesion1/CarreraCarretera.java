package Sesion1;


public class CarreraCarretera extends Carrera  {
    
    public CarreraCarretera(int numBicicletas) {
        this.tasaAbandono = 10;
        FactoriaCarretera factoria = new FactoriaCarretera();
        this.CrearBicicletas(factoria, numBicicletas);
        this.iniciarCarrera();
    }

    @Override
    public String toString() {
        return "CarreraCarretera{" + super.toString() + "}";
    }
    
    
}