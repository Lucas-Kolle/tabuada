package br.senai.sp.jandira.taboada.model;

import java.util.Scanner;

public class Taboada {

    int[] multiplicandos = new int[1];
    int[] multiplicadores = new int[2];
    int[] produtos = new int[100];

    public void coletarDados() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o multiplicando: ");
        multiplicandos[0] = leitor.nextInt();

        System.out.print("Digite o primeiro multiplicador: ");
        multiplicadores[0] = leitor.nextInt();

        System.out.print("Digite o ultimo multiplicador: ");
        multiplicadores[1] = leitor.nextInt();

        verificarDados();
    }

    public void verificarDados(){

        if ( multiplicadores[0] > multiplicadores[1]){
            System.out.println("O primeiro multiplicador DEVE ser menor que o umtimo");
            coletarDados();
        }else{
            realizarCalculo();
        }
    }

    public void realizarCalculo(){

        produtos =
    }
}
