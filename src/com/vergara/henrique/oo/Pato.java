package com.vergara.henrique.oo;

public abstract class Pato {

    public void quack(){
        System.out.println("Quack quack quack!!!!!");
    }

    public void nadar() {
        System.out.println("O Pato nadou...");
    }

    public void voar() {
        System.out.println("O Pato voou...");
    }

    public abstract void mostrar();

}
