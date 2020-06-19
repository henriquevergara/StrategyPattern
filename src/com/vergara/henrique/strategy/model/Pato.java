package com.vergara.henrique.strategy.model;

import com.vergara.henrique.strategy.interfaces.ComportamentoQuack;
import com.vergara.henrique.strategy.interfaces.ComportamentoVoar;

public abstract class Pato {

    ComportamentoVoar comportamentoVoar;
    ComportamentoQuack comportamentoQuack;

    public void performaQuack(){
        comportamentoQuack.quack();
    }

    public void performaVoo(){
        comportamentoVoar.voar();
    }

    public void nadar() {
        System.out.println("O Pato nadou...");
    }

    public void mostrar(){

    }

}
