package Sesion1;

public class CarreraMontana extends Carrera {
    
    public CarreraMontana() {
        this.tasaAbandono = 20;
    }
    
    @Override
    public String toString() {
        return "CarreraMontana{" + super.toString() + "}";
    }
}