
import java.util.Scanner;



public class ContaTerminal{

    public static void main(String[] args) {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;    

        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tBem Vindo!\n");

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        sc.reset();

        System.out.println("Digite o numero da Agencia: ");
        agencia = sc.nextLine();
        sc.reset();
        

        System.out.println("Digite o numero de sua conta bancaria: ");
        numeroConta = sc.nextInt();
        sc.reset();
        
        System.out.println("Digite o saldo a ser depositado: ");
        saldo = sc.nextDouble();
        sc.reset();
        

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, "
        +"conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        System.out.println("\n\n\n");

    }
}