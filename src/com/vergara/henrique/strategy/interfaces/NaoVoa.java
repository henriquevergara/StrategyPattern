package com.vergara.henrique.strategy.interfaces;

public class NaoVoa implements ComportamentoVoar {

    @Override
    public void voar() {
        System.out.println("Nao consegue voar");
    }
}
