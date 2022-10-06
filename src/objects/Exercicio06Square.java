package objects;

public class Exercicio06Square {
    private int lado;

    public Exercicio06Square(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calculaArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exercicio06Square{");
        sb.append("lado=").append(lado);
        sb.append('}');
        return sb.toString();
    }
}
