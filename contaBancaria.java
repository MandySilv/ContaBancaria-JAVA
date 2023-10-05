import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        String nomeandoCliente = "Lohan";
        String tipoDaConta = "Corrente";
        Double saldo = 5000.50;
        Scanner leitura = new Scanner(System.in);
        System.out.println("***** Digite sua opção! *****");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Transferir Valor");
        System.out.println("3 - Receber Valor");
        System.out.println("4 - Sair");
        int opcao = leitura.nextInt();
        if (opcao == 1) {
            System.out.println("Seu saldo atual é  " + saldo);
        }
        if (opcao == 2) {
            System.out.println("Qual valor deseja transferir?");
            double transferencia = leitura.nextDouble();
            System.out.println("Transferencia concluida! Seu saldo atual é: " + (saldo - transferencia));
        }
        if (opcao == 3) {
            System.out.println("Qual valor deseja receber?");
            double receber = leitura.nextDouble();
            System.out.println("Valor recebido! Seu saldo atual é: " + (saldo + receber));
        }
        if (opcao == 4) {
            String confirmacao = leitura.nextLine();
            System.out.println("Saiu");
        }
    }
}
