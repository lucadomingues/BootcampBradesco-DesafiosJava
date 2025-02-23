import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num;
        String nomeCliente;
        String agencia;
        float saldo;

        //Exibir mensagens para o usuário e obter valores pelo Scanner
        System.out.println("Digíte o número da conta: ");
        num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digíte seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digíte sua agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digíte seu saldo: ");
        saldo = scanner.nextFloat();

        //Formata com 2 casas decimais
        String saldoFormatado = String.format("%.2f", saldo);

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+num+" e seu saldo "+saldoFormatado+" já está disponível para saque.");

        scanner.close();
    }
}
