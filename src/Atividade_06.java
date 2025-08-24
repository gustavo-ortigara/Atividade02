import java.util.Scanner;

public class Atividade_06 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite a média final do aluno: ");
        int mediaFinal = terminal.nextInt();

        if(mediaFinal>=7){
            System.out.println("Aluno aprovado!");
        }else if(mediaFinal>=5){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }

    }
}
