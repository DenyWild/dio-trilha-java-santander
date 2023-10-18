import java.util.Scanner;
import model.ContaBanco;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nomeCliente;
        int numeroConta;
        String agencia;
        double saldoConta;

        System.out.println("Seja Bem-vindo(a) ao banco que impulsiona a sua vida!");
        System.out.println("Digite seu nome: ");
        nomeCliente = scan.next();
        System.out.println("Digite o numero da conta: ");
        numeroConta = scan.nextInt();
        System.out.println("Digite o numero da agencia: ");
        agencia = scan.next();
        System.out.println("Digite o saldo da conta: ");
        saldoConta = scan.nextDouble();
        ContaBanco contaBanco = new ContaBanco(nomeCliente, numeroConta, agencia, saldoConta);
        System.out.printf("Olá: %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta: %d, e seu saldo: %.2f já está disponível para saque.", contaBanco.getNomeCliente(), contaBanco.getAgencia(), contaBanco.getNumero(), contaBanco.getSaldo());

    }
}
