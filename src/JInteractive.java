import java.util.Scanner;

public class JInteractive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner: permite a leitura de dados da entrada, o que torna possível interagir com o usuário.
        System.out.println("Digite seu nome:");

        String name = scanner.nextLine(); // Armazena uma string na variavel name, que dará sequência na execução do código

        System.out.println("Olá "+ name); // mostrará o resultado do que foi armazenado
    }
}
