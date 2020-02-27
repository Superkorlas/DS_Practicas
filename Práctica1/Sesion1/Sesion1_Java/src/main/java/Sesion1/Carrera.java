package Sesion1;

import java.util.ArrayList;


public abstract class Carrera {
    protected ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    protected float tasaAbandono;
    protected float duracionCarrera = 10;
    
    protected void CrearBicicletas(FactoriaCarreraYBicicleta factoria, int numBicicletas) {
        for (int i = 0; i < numBicicletas; i++) {
            Bicicleta bicicleta = factoria.crearBicicleta();
            this.anadirBicicleta(bicicleta);
        }
    }
    
    public void anadirBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            bicicletas.add(bicicleta);
            bicicleta.prepararParaCarrera(bicicletas.size(), duracionCarrera);
        }
    }
    
    public void iniciarCarrera() {
        //Calculamos en qué momento abandonan y cuántas bicicletas abandonan.
        float momentoAbandono = (float) Math.random() * (duracionCarrera - 1) + 1;
        int numeroAbandonos = Math.round(bicicletas.size() * (tasaAbandono/100));
        
        //Se selecionan aquellos participantes que abandonarán la carrera.
        this.elegirAbandonos(numeroAbandonos, momentoAbandono);
        
        //Las bicicletas empiezan la carrera
        for (Bicicleta bicicleta : bicicletas) {
            bicicleta.start();
        }
    }
    
    private void elegirAbandonos(int numeroAbandonos, float momentoAbandono) {
        System.out.println("Van a abandonar " + numeroAbandonos + " bicicletas en el segundo " + momentoAbandono);
        
        ArrayList<Bicicleta> bicicletasRetiradas = new ArrayList<>(bicicletas);
        while (numeroAbandonos > 0) {
            int indice = (int) Math.random() * bicicletasRetiradas.size() + 1;
            int dorsalAbandono = bicicletasRetiradas.get(indice).getDorsal();
            bicicletas.get(dorsalAbandono).abandonarCarrera(momentoAbandono);
            bicicletasRetiradas.remove(indice);
            numeroAbandonos--;
        }
    }
    
    @Override
    public String toString() {
        return "Carrera{" +"tasaAbandono=" + tasaAbandono + ", duracionCarrera=" + duracionCarrera + ", bicicletas=" + bicicletas + '}';
    }
 
}