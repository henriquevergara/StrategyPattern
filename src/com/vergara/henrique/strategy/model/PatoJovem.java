package com.vergara.henrique.strategy.model;

import com.vergara.henrique.strategy.interfaces.ComportamentoVoar;
import com.vergara.henrique.strategy.interfaces.NaoVoa;
import com.vergara.henrique.strategy.interfaces.Quack;

public class PatoJovem extends Pato{

    public PatoJovem() {
        comportamentoVoar = new NaoVoa();
        comportamentoQuack = new Quack();
    }

    public void setComportamentoVoar(ComportamentoVoar comportamentoNovo){
        comportamentoVoar = comportamentoNovo;
    }

}
