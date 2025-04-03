import java.util.UUID;

public class Conta {

    // Classe Cliente como uma classe estática interna
    public static class Cliente {

        private final String nome; // Nome do cliente
        private boolean ativo; // Status do cliente (ativo ou inativo)

        // Construtor da classe Cliente
        public Cliente(String nome) {
            this.nome = nome; // Inicializa o nome do cliente
            this.ativo = true; // Define o cliente como ativo por padrão
        }

        // Retorna o nome do cliente
        public String getName() {
            return nome;
        }

        // Retorna se o cliente está ativo
        public boolean isAtivo() {
            return ativo;
        }

        // Define o status ativo do cliente
        public void setAtivo(boolean ativo) {
            this.ativo = ativo;
        }
    }

    private final String numero; // Número da conta
    private final String agencia; // Número da agência
    private final Cliente cliente; // Cliente associado à conta
    private double saldo; // Saldo da conta

    // Construtor da classe Conta
    public Conta(String numero, String agencia, Cliente cliente) {
        this.numero = numero; // Inicializa o número da conta
        this.agencia = agencia; // Inicializa o número da agência
        this.saldo = 450.0; // Define o saldo inicial padrão como 450.0
        this.cliente = cliente; // Associa o cliente à conta
    }

    // Retorna o número da conta
    public String getNumero() {
        return numero;
    }

    // Retorna o número da agência
    public String getAgencia() {
        return agencia;
    }

    // Retorna o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Retorna o cliente associado à conta
    public Cliente getCliente() {
        return cliente;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Adiciona o valor ao saldo
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // Subtrai o valor do saldo
            return true; // Saque realizado com sucesso
        } else {
            System.out.println("Saldo insuficiente ou valor inválido."); // Mensagem de erro
            return false; // Saque não realizado
        }
    }

    // Método para depositar dinheiro na conta
    public void pix(double valor) {
    if (valor > 0) {
        String chavePix = UUID.randomUUID().toString(); // Gera uma chave Pix aleatória
        System.out.println("Cobrança Pix gerada com sucesso!");
        System.out.println("Valor: R$" + valor);
        System.out.println("Chave Pix: " + chavePix);
    } else {
        System.out.println("Valor inválido para cobrança Pix.");
    }
}
}