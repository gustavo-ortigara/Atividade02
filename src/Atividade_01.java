package br.Atividade02;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe uma idade");
        int idade = terminal.nextInt();

                if(idade>18){
            System.out.println("É maior de idade");
        }else{
            System.out.println("É menor de idade");
        }

    }
}
