import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o nome de usuário: ");
        String usuario = terminal.nextLine();

        System.out.print("Digite a senha: ");
        String senha = terminal.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }
}
