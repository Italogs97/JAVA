import java.util.Scanner; // Importa a classe Scanner para capturar entradas do usuário

public class App {

    // Objeto Scanner para capturar entradas do usuário no console
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Mensagem de boas-vindas ao sistema bancário
        System.out.println("Bem-vindo ao sistema bancário!");

        // Solicita o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // Captura o nome do cliente

        // Solicita e valida o número da agência (4 dígitos)
        String agencia = validarEntrada("Digite o número da agência (4 dígitos): ", 4);

        // Solicita e valida o número da conta (6 dígitos)
        String numeroConta = validarEntrada("Digite o número da conta (6 dígitos): ", 6);

        // Cria um objeto Cliente com o nome fornecido
        Conta.Cliente cliente = new Conta.Cliente(nomeCliente); // Usando a classe interna estática

        // Cria um objeto Conta com os dados fornecidos
        Conta conta = new Conta(numeroConta, agencia, cliente);

        // Exibe as informações da conta no console
        System.out.println("\nInformações da Conta:");
        System.out.println("Agência: " + conta.getAgencia()); // Exibe o número da agência
        System.out.println("Conta: " + conta.getNumero()); // Exibe o número da conta
        System.out.println("Cliente: " + conta.getCliente().getName()); // Exibe o nome do cliente
        System.out.println("Saldo: " + conta.getSaldo()); // Exibe o saldo inicial da conta
    }

    // Método para validar entradas numéricas com tamanho fixo
    private static String validarEntrada(String mensagem, int tamanho) {
        String entrada; // Variável para armazenar a entrada do usuário
        do {
            System.out.print(mensagem); // Exibe a mensagem solicitando a entrada
            entrada = scanner.nextLine(); // Captura a entrada do usuário
            // Verifica se a entrada tem o tamanho correto e contém apenas números
            if (entrada.length() != tamanho || !entrada.matches("\\d+")) {
                System.out.println("Entrada inválida. Deve conter exatamente " + tamanho + " dígitos.");
            }
        } while (entrada.length() != tamanho || !entrada.matches("\\d+")); // Repete até a entrada ser válida
        return entrada; // Retorna a entrada válida
    }
}