import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de contas bancárias!");

        System.out.print("\nInforme o número da Conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nPor favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("\nAgora, informe o nome do cliente: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("\nDigite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeDoCliente, agencia, numeroDaConta, saldo);
    }
}
