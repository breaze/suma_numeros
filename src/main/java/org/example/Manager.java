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

    /**
     * Suma todos los números en la lista.
     * @return La suma de los números.
     */
    public int sumarNumeros(){
        return this.numeros.stream().mapToInt(Integer::intValue).sum();
    }



}
