package objects;

public class Exercicio10Posto {
    private String tipoCombustivel;
    private float valorLitro;
    private float quantCombus;

    public Exercicio10Posto(String tipoCombustivel, float valorLitro, float quantCombus) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantCombus = quantCombus;
    }

    public float abastecerPorValor(float valor) {
        quantCombus -= valorLitro*valor;
        return valor/valorLitro;
    }

    public float abastecerPorLitro(float litro) {
        quantCombus -= litro;
        return litro*valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setQuantCombus(float quantCombus) {
        this.quantCombus = quantCombus;
    }
}
