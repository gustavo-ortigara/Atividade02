import java.util.Scanner;

public class Atividade_09 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = terminal.nextDouble();

        if(numero>0){
            System.out.println("O número informado é positivo!");
        }else if(numero<0){
            System.out.println("O número informado é negativo!");
        }else{
            System.out.println("O número informado é zero!");
        }
    }
}
