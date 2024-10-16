import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia o objeto Scanner para receber dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita e armazena o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpa o buffer do scanner
        scanner.nextLine();

        // Solicita e armazena o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e armazena o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e armazena o saldo inicial
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados recebidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo
                + " já está disponível para saque.");

        // Fecha o objeto Scanner
        scanner.close();
    }
}
