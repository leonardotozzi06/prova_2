package com.example;

public class Cestino{
    
    int valore;

    public Cestino(int i){
        valore = i;
    }

    public int getValore() {
        return valore;
    }

    synchronized public void aggiungiMoneta(){
        valore = valore + 1;
    }
    
}
