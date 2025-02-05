import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;



        System.out.println("Por favor, digite o Número da Conta: ");
        numero = new Scanner(System.in).nextInt();

        System.out.println("Por favor, digite o Número da Agência: ");
        agencia = new Scanner(System.in).next();

        System.out.println("Por favor, digite o Nome do Cliente: ");
        Scanner scan = new Scanner(System.in);
        nomeCliente="";
        nomeCliente+=scan.nextLine();

        System.out.println("Por favor, digite o Saldo: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque");

        scan.close();
        scanner.close();
    }
}
