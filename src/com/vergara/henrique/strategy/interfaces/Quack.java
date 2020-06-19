package com.vergara.henrique.strategy.interfaces;

public class Quack implements ComportamentoQuack{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack Quack!");
    }
}
