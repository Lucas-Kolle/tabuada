package br.senai.sp.jandira.taboada.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        // definindo o tamanho da tela (largura / altura)
        stage.setWidth(500);
        stage.setHeight(500);

        // adicionando titulo
        stage.setTitle("Tabuada");

        // criando o root - componente principal
        VBox root = new VBox();

        // criando a cena e colocando o root nela
        Scene scene = new Scene(root);

        // colocando a cena no palco
        stage.setScene(scene);

        // stage show é pra mostrar a tela
        stage.show();

    }
}
