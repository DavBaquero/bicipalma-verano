package edu.badpals.domain.estacion;

import edu.badpals.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;

    private Movil bici = null;

    Anclaje(){}
    
    boolean isOcupado(){
        return this.ocupado;
    }

    Movil getBici() {
        return bici;
    }

    void anclarBici(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString(){
        return "ocupado: " + Boolean.toString(isOcupado());
    }
}
