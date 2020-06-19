package com.vergara.henrique.strategy.interfaces;

public class VoarComAsas implements ComportamentoVoar {
    @Override
    public void voar() {
        System.out.println("Voando com as asas.");
    }
}
