import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Conta sem digito:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo:");
        Double saldo = scanner.nextDouble();

        System.out.println("Muito obrigado por preencher as informações necessárias. Favor aguardar.");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
