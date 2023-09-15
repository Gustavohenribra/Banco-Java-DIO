import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        //Variaveis
        int conta;
        String agencia;
        String nome;
        float saldo;

        //Informaçao solicitada ao usuario:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite a sua agencia:");
        agencia = scanner.nextLine();

        System.out.println("Digite o numero da sua conta:");
        conta = scanner.nextInt();

        System.out.println("Digite o seu saldo:");
        saldo = scanner.nextFloat();

        scanner.close();

        //Mensagem final + respostas
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}