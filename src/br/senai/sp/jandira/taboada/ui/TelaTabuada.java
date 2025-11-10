package br.senai.sp.jandira.taboada.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
        root.setStyle("-fx-background-color: blue;");

        // criando a cena e colocando o root nela
        Scene scene = new Scene(root);

        // colocando a cena no palco
        stage.setScene(scene);

        // criando header
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: green;");

        // criando grid de formulário
        GridPane gridformulario = new GridPane();
        gridformulario.setPrefHeight(100);
        gridformulario.setStyle("-fx-background-color: yellow;");

        // criando a caixa de botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: red;");

        // criando a caixa de resultados
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: purple;");

        // adicionar componentes no root
        root.getChildren().add(header);
        root.getChildren().add(gridformulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);

        // stage show é pra mostrar a tela
        stage.show();

    }
}
