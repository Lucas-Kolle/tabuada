package br.senai.sp.jandira.taboada.ui;

import javafx.application.Application;
import javafx.stage.Stage;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        // definindo o tamanho da tela (largura / altura)
        stage.setWidth(500);
        stage.setHeight(500);

        // adicionando titulo
        stage.setTitle("Tabuada");

        // stage show é pra mostrar a tela
        stage.show();
    }
}
