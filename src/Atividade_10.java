import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: R$ ");
        double valorCompra = terminal.nextDouble();

        double percentualDesconto = 0.0;

        if (valorCompra > 500) {
            percentualDesconto = 20;
        } else if (valorCompra >= 200) {
            percentualDesconto = 10;
        } else if (valorCompra >= 100) {
            percentualDesconto = 5; //
        } else {
            percentualDesconto = 0;
        }

        double valorDesconto = valorCompra * (percentualDesconto / 100);
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Resumo da compra: ");
        System.out.println("Valor original: R$ "+ valorCompra);
        System.out.println("Desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
