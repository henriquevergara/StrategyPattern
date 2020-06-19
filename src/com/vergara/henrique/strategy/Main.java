package com.vergara.henrique.strategy;

import com.vergara.henrique.strategy.interfaces.VoarComAsas;
import com.vergara.henrique.strategy.model.PatoJovem;

public class Main {
    public static void main(String[] args) {

        PatoJovem jovem = new PatoJovem();

        jovem.performaVoo();
        jovem.performaQuack();

        jovem.setComportamentoVoar(new VoarComAsas());

        jovem.performaVoo();

    }
}
