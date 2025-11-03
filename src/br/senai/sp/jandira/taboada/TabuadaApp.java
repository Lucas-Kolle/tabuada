package br.senai.sp.jandira.taboada;

import br.senai.sp.jandira.taboada.model.Tabuada;

public class TabuadaApp {
    public static void main(String[] args) {

        System.out.println("****INICIANDO APLICATIVO****");

        Tabuada tabuada = new Tabuada();
        tabuada.coletarDados();

    }
}
