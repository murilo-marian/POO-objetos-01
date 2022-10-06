package objects;

public class Exercicio08Banco {
    private int conta;
    private String nome;
    private float saldo;

    public Exercicio08Banco(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
        saldo = 0;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void deposito(float money) {
        saldo += money;
    }

    public void saque(float money) {
        saldo -= money;
    }
}
