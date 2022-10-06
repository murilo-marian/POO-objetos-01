package objects;

public class Exercicio01Usuario {
    private String nome;
    private String sobrenome;

    public Exercicio01Usuario(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() != 0) {
            this.nome = nome;
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usuário{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobrenome='").append(sobrenome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String toCompleto() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" ");
        sb.append(sobrenome);
        return sb.toString();
    }
}
