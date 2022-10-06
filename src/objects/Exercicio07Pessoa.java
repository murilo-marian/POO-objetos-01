package objects;

public class Exercicio07Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Exercicio07Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int a) {
        if (idade < 21) {
            altura += 0.5*a;
        }
        idade += a;
    }

    public void engordar(int gordar) {
        peso += gordar;
    }

    public void emagrecer(int magrar) {
        peso -= magrar;
    }

    public void crescer(int cresce) {
        altura += cresce;
    }
}