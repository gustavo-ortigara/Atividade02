import java.util.Scanner;

public class Atividade_08 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = terminal.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente");
        } else if (temperatura >= 15) {
            System.out.println("Agradável");
        } else {
            System.out.println("Frio");
        }
    }
}
