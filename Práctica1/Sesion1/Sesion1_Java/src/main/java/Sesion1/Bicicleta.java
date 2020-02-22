package Sesion1;



public abstract class Bicicleta implements Runnable {
	private int id;
        
        public void SetID(int id) {
            this.id = id;
        }
        
        public int GetID() {
            return id;
        }

    @Override
    public String toString() {
        return "Bicicleta{" + "id=" + id + '}';
    }
        
        
}