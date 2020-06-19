package com.vergara.henrique.strategy.model;

import com.vergara.henrique.strategy.interfaces.NaoVoa;
import com.vergara.henrique.strategy.interfaces.Squeak;

public class PatoBorracha extends Pato{

    public PatoBorracha() {
        comportamentoQuack = new Squeak();
        comportamentoVoar = new NaoVoa();
    }

    public void mostrar(){
        System.out.println("É apenas um pato de borracha =D.");
    }

}
