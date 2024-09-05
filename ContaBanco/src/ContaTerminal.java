import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numeroConta = input.nextInt();

        System.out.print("Digite o numero da agencia: ");
        String agenciaConta = input.next();

        System.out.print("Insira o nome completo do cliente: ");
        String nomeClienteConta = input.nextLine();
        nomeClienteConta = input.nextLine();

        System.out.print("Informe o saldo da conta: ");
        Double saldoConta = input.nextDouble();

        System.out.println("Olá " + nomeClienteConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
