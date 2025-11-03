package br.senai.sp.jandira.taboada.model;

import java.util.Scanner;

public class Tabuada {

    public int multiplicando;
    public int multiplicadorInicial;
    public int multiplicadorFinal;
    public String[] tabuada;

    public void coletarDados() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o Número que será multiplicado?: ");
        multiplicando = leitor.nextInt();

        System.out.print("Digite o multiplicador inicial: ");
        multiplicadorInicial = leitor.nextInt();

        System.out.print("Qual é o valor do multiplicodr final?: ");
        multiplicadorFinal = leitor.nextInt();

        calcularTabuada();
    }

    public void calcularTabuada(){
        //criando varialvél de apoio para ajudar a inverter os valores
        int apoio = 0;

        //garantindo que o incial será menor que o final
        if (multiplicadorFinal < multiplicadorInicial){
            apoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = apoio;
        }
        int tamanho = multiplicadorFinal - multiplicadorInicial + 1;
        tabuada = new String[tamanho];

        int i = 0;
        //criando looping
        while (i < tamanho){
            int produto = multiplicando * multiplicadorInicial;
            tabuada[i] = multiplicando + " x " + multiplicadorInicial + " = " + produto;

            multiplicadorInicial = multiplicadorInicial + 1;
            i = i + 1;
        }

        exibirTabuada();
    }

    public void exibirTabuada(){

        System.out.println("Resultado da sua taboada");

        int i = 0;
        while (i < tabuada.length){
            System.out.println(tabuada[i]);
            i++; //é a mesma coisa de i + 1
        }

    }


}
