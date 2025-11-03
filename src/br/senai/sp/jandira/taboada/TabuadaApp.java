package br.senai.sp.jandira.taboada;

import br.senai.sp.jandira.taboada.model.Taboada;

public class TaboadaApp {
    public static void main(String[] args) {

        System.out.println("****INICIANDO APLICATIVO****");

        Taboada taboada = new Taboada();
        taboada.coletarDados();

    }
}
