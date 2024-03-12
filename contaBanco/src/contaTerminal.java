import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        //TODO:conhecer e importar a classe scanner
        Scanner teclado = new Scanner(System.in);
        //exibir as mensagem para o usuario
        //obter pela classe scanner pelos valores digitados no terminal
        System.out.println("Por favor digite o munero da conta");
        numeroConta = teclado.nextInt();
        System.out.println("Por favor digite a agencia");
        agencia = teclado.next();
        System.out.println("Digite seu nome");
        nomeCliente = teclado.next();
        System.out.println("Digite seu saldo");
        saldo = teclado.nextDouble();
        //exibir a mensagom criada
        System.out.printf(("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d e seu saldo %.2f já está disponível" +
                " para saque"),nomeCliente,agencia,numeroConta,saldo);
        teclado.close();
    }
}
