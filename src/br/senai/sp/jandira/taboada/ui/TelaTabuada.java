package br.senai.sp.jandira.taboada.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
        root.setStyle("-fx-background-color: #93dbff;");

        // criando a cena e colocando o root nela
        Scene scene = new Scene(root);

        // colocando a cena no palco
        stage.setScene(scene);

        // criando header
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: green;");

        // adicionando o conteúdo do header
        Label labelTitulo = new Label("Tabuada");
        Label labelSubtitulo = new Label("Crie a tabuada que a sua imaginação mandar");

        // colocando label dentro do header
        header.getChildren().addAll(labelTitulo, labelSubtitulo);

        // criando grid de formulário
        GridPane gridformulario = new GridPane();
        gridformulario.setPrefHeight(100);
        gridformulario.setStyle("-fx-background-color: yellow;");

        // criando conteúdo do grid
        Label labelMultiplicando = new Label("Multiplicando");
        TextField textFieldMultiplicando = new TextField();

        Label labelMenorMultiplicador = new Label("Menor Multiplicador");
        TextField textFieldMenorMultiplicador = new TextField();

        Label labelMaiorMultiplicador = new Label("Maior Multiplicador");
        TextField textFieldMaiorMultiplicador = new TextField();

        // colocando os componentes no grid
        gridformulario.add(labelMultiplicando, 0, 0);
        gridformulario.add(textFieldMultiplicando, 1, 0);

        gridformulario.add(labelMenorMultiplicador, 0, 1);
        gridformulario.add(textFieldMenorMultiplicador, 1, 1);

        gridformulario.add(labelMaiorMultiplicador, 0, 2);
        gridformulario.add(textFieldMaiorMultiplicador, 1, 2);

        // criando a caixa de botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: red;");

        // criando conteúdo do box botoes
        Button buttonCalcular = new Button("Calcular");
        Button buttonLimpar = new Button("Limpar");
        Button buttonSair = new Button("Sair");

        // adicionando os componentes no hbox
        boxBotoes.getChildren().addAll(buttonCalcular, buttonLimpar, buttonSair);

        // criando a caixa de resultados
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: purple;");

        // criando conteúdo da caixa de resultados
        Label labelResultados = new Label("Resultados");
        ListView listaTabuada = new ListView();

        // adicionando os componentes na vbox resultados
        boxResultados.getChildren().addAll(labelResultados, listaTabuada);


        // adicionar componentes no root
        root.getChildren().add(header);
        root.getChildren().add(gridformulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);

        // stage show é pra mostrar a tela
        stage.show();

    }
}
