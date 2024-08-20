package edu.badpals.domain.bicicleta;

public class Bicicleta implements Movil{
    private int id = 0;

    public Bicicleta(int id) {
        this.id = id;
    } 

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return Integer.toString(id);
    }

}
