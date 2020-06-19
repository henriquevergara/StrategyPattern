package com.vergara.henrique.strategy.interfaces;

public class Squeak implements ComportamentoQuack {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
