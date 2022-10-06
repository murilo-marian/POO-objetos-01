package objects;

public class Exercicio02Calc {
    private int n1;
    private int n2;

    public Exercicio02Calc(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String mostraNumero() {
        StringBuilder sb = new StringBuilder();
        for (int i = n1 + 1; i < n2; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
