package objects;

public class Exercicio04Sal {

    private float sal;
    private float ir;
    private float inss;
    private float sindicato;
    private float salFinal;

    public Exercicio04Sal(float valorHora, float horaMensal) {
        sal = valorHora*horaMensal;
        ir = sal*0.11f;
        inss = sal*0.08f;
        sindicato = sal*0.05f;
        salFinal = sal-ir-inss-sindicato;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getSindicato() {
        return sindicato;
    }

    public void setSindicato(float sindicato) {
        this.sindicato = sindicato;
    }

    public float getSalFinal() {
        return salFinal;
    }

    public void setSalFinal(float salFinal) {
        this.salFinal = salFinal;
    }
}


