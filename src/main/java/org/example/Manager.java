package org.example;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Integer> numeros;

    public Manager() {
        this.numeros = new ArrayList<>();
    }

    public void addNumero(int numero) {
        this.numeros.add(numero);
    }

    public int sumarNumeros(){
        int total = 0;
        for(int numero : this.numeros){
            total += numero;
        }
        return total;
    }



}
