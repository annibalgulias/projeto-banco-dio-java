import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Imaginário !");
        System.out.println("Crie sua conta seguindo os seguintes passos: ");

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();


        System.out.println("Por favor, digite o número da agência com dígito: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();


        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque." );

    }
}
