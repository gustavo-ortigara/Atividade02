package br.Atividade02;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe uma nota");
        int nota = terminal.nextInt();

        if(nota>=9){
            System.out.println("A nota é excelente");
        }else if(nota>=7){
            System.out.println("A nota é boa");
        }else if(nota>=6){
            System.out.println("A nota é satisfatória");
        }else{
            System.out.println("A nota é insatisfatória");
        }

    }
}
