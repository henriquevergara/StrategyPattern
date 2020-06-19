package com.vergara.henrique.oo;

import com.vergara.henrique.oo.PatoBorracha;
import com.vergara.henrique.oo.PatoSelvagem;
import com.vergara.henrique.oo.PatoUrbano;

public class Main {

    public static void main(String[] args) {

        PatoSelvagem selvagem = new PatoSelvagem();
        PatoUrbano urbano = new PatoUrbano();
        PatoBorracha borracha = new PatoBorracha();


        selvagem.quack();
        urbano.quack();
        borracha.quack();

        selvagem.mostrar();
        urbano.mostrar();
        borracha.mostrar();

    }
}
