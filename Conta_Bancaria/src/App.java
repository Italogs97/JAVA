import java.util.Scanner; // Importa a classe Scanner para capturar entradas do usuário

public class App {

    private static final double CHEQUE_ESPECIAL = 1000.0; // Limite do cheque especial 


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

         // chama o método para exibir o menu de oparações
       
    exibirMenu(conta);
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

    
   

    // Método para exibir o menu de operações
    private static void exibirMenu(Conta conta){
         boolean continuar = true; // Variável para controlar o loop do menu
    

    while(continuar){

        System.out.println("\nEscolha uma operação:");
        System.out.println("1. Depositar"); // Opção para depositar
        System.out.println("2. Sacar"); // Opção para sacar
        System.out.println("3. Consultar saldo"); // Opção para consultar saldo
        System.out.println("4. Cheque Especial"); // Opção para cheque especial
        System.out.println("5. Boleto"); // Opção para boleto
        System.out.println("6. Pix de recebimento"); // Opção para Pix
        System.out.println("7. Sair"); // Opção para sair
        System.out.print("Opção: ");// Solicita a opção do usuário

        int opcao = scanner.nextInt(); // Captura a opção escolhida pelo usuário
        scanner.nextLine(); // Limpa o buffer do scanner


        switch (opcao){
            case 1: // Depósito
            System.out.println("Digite o valor a ser depositado: ");
            double valorDeposito = scanner.nextDouble();
            scanner.nextLine(); // Consumir o caractere de nova linha
            conta.depositar(valorDeposito); // Chama o método de depósito
            break;

        case 2: // Saque
            System.out.println("Digite o valor que deseja sacar: ");
            double valorSaque = scanner.nextDouble(); // Captura o valor a ser sacado
            scanner.nextLine(); // Consumir o caractere de nova linha
            if (conta.sacar(valorSaque)) { // Chama o método de saque
                System.out.println("Saque realizado com sucesso!"); // Mensagem de sucesso
            }
            break;

            case 3: // Consultar saldo
                System.out.println("Seu saldo é: " + conta.getSaldo()); // Exibe o saldo atual
                break; // Sai do switch

            
            case 4: // Cheque Especial
                System.out.println("Seu saldo é: " + conta.getSaldo()); // Exibe o saldo atual
                System.out.println("Seu limite de cheque especial é: " + CHEQUE_ESPECIAL); // Exibe o limite do cheque especial
                break; // Sai do switch

            case 5: // Boleto
                System.out.println("Funcionalidade de Boleto ainda não implementada.");
                break;

            case 6: //Cobrança Pix
            System.out.println("Digite o valor a ser cobrado ");
            double valorPix = scanner.nextDouble();
            scanner.nextLine(); // Consumir o caractere de nova linha
            conta.pix(valorPix); // Chama o método de depósito
            break;
                
            case 7: // Sair
                System.out.println("Obrigado por usar o sistema bancário!");
                continuar = false; // Encerra o loop
                break;
            }
        }

    }


}
