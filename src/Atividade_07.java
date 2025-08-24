import java.util.Scanner;

public class Atividade_07 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("===CALCULADORA===");
        System.out.println("Digite o primeiro número: ");
        int n1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = terminal.nextInt();
        System.out.println("Escolha uma operação: +, -, *, /");
        String operacao = terminal.next();

        if(operacao.equals("+")) {
            System.out.println("o resultado da soma de " + n1 + " e " + n2 + " é " + (n1 + n2));
        }else if(operacao.equals("-")) {
            System.out.println("o resultado da subtração de " + n1 + " e " + n2 + " é " + (n1 - n2));
        }else if(operacao.equals("*")) {
            System.out.println("o resultado da multiplicação de " + n1 + " e " + n2 + " é " +  (n1 * n2));
        }else if(operacao.equals("/")) {
            System.out.println("o resultado da divisão de " + n1 + " e " + n2 + " é " +  (n1 / n2));
        }else{
            System.out.println("a operação escolhida não é válida!");
        }


    }
}
