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
}