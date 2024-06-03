import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número de sua agência: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        float saldo = scanner.nextFloat();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
