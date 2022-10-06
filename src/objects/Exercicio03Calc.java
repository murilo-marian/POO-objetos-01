package objects;

public class Exercicio03Calc {
    private int n1;
    private int n2;

    public Exercicio03Calc(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int calcMultiply() {
        return n1*n2;
    }

    public int calcSum() {
        return n1+n2;
    }

    public int calcSub() {
        return n1-n2;
    }

    public String calcDiv() {
        try {
            return String.valueOf((float)n1/n2);
        } catch (ArithmeticException e) {
            return "Inválido, divisão por 0";
        }
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
