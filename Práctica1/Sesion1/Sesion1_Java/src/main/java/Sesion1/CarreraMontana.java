package Sesion1;

public class CarreraMontana extends Carrera {
    
    public CarreraMontana(int numBicicletas) {
        this.tasaAbandono = 20;
        FactoriaMontana factoria = new FactoriaMontana();
        this.CrearBicicletas(factoria, numBicicletas);
        this.iniciarCarrera();
    }
    
    @Override
    public String toString() {
        return "CarreraMontana{" + super.toString() + "}";
    }
}