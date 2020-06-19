package com.vergara.henrique.strategy.model;

import com.vergara.henrique.strategy.interfaces.Quack;
import com.vergara.henrique.strategy.interfaces.VoarComAsas;

public class PatoSelvagem extends Pato {

    public PatoSelvagem() {
        comportamentoQuack = new Quack();
        comportamentoVoar = new VoarComAsas();
    }

    @Override
    public void mostrar() {
        System.out.println("É um pato Selvagem =0.");
    }
}
