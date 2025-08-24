import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = terminal.nextInt();

        if(numero%2 != 0){
            System.out.println("o número é ímpar");
        }else{
            System.out.println("O número é par");
        }

    }
}
