package objects;

import java.text.DecimalFormat;

public class Exercicio05Menu {
    private float cachorro;
    private float bauru;
    private float baurovo;
    private float ham;
    private float cheese;
    private float refri;
    private float total;

    public Exercicio05Menu(float cachorro, float bauru, float baurovo, float ham, float cheese, float refri) {
        this.cachorro = cachorro * 1.2f;
        this.bauru = bauru * 1.3f;
        this.baurovo = baurovo * 1.5f;
        this.ham = ham * 1.2f;
        this.cheese = cheese * 1.3f;
        this.refri = refri;
        total = this.cachorro + this.bauru + this.baurovo + this.ham + this.cheese + this.refri;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getCachorro() {
        return cachorro;
    }

    public void setCachorro(float cachorro) {
        this.cachorro = cachorro;
    }

    public float getBauru() {
        return bauru;
    }

    public void setBauru(float bauru) {
        this.bauru = bauru;
    }

    public float getBaurovo() {
        return baurovo;
    }

    public void setBaurovo(float baurovo) {
        this.baurovo = baurovo;
    }

    public float getHam() {
        return ham;
    }

    public void setHam(float ham) {
        this.ham = ham;
    }

    public float getCheese() {
        return cheese;
    }

    public void setCheese(float cheese) {
        this.cheese = cheese;
    }

    public float getRefri() {
        return refri;
    }

    public void setRefri(float refri) {
        this.refri = refri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exercicio05Menu{");
        sb.append("cachorro=").append(cachorro);
        sb.append(", bauru=").append(bauru);
        sb.append(", baurovo=").append(baurovo);
        sb.append(", ham=").append(ham);
        sb.append(", cheese=").append(cheese);
        sb.append(", refri=").append(refri);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
}
