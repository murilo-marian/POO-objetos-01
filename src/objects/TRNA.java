package objects;

import java.util.Arrays;

public class TRNA {

    private int tam;

    private String[] fita;
    private String[] trans;
    private int aOri = 0;
    private int tOri = 0;
    private int gOri = 0;
    private int cOri = 0;
    private int uTrans = 0;
    private int aTrans = 0;
    private int cTrans = 0;
    private int gTrans = 0;

    public TRNA(int tam) {
        this.tam = tam;
        fita = new String[tam];
        trans = new String[tam];
    }

    public void transcricao() {
        for (int i = 0; i < fita.length; i++) {
            String s = fita[i];
            if ("A".equals(s)) {
                trans[i] = "U";
                aOri++;
                uTrans++;
            } else if ("T".equals(s)) {
                trans[i] = "A";
                tOri++;
                aTrans++;
            } else if ("G".equals(s)) {
                trans[i] = "C";
                gOri++;
                cTrans++;
            } else if ("C".equals(s)) {
                trans[i] = "G";
                cOri++;
                gTrans++;
            }
        }
    }

    public String[] getFita() {
        return fita;
    }

    public void setFita(String[] fita) {
        this.fita = fita;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String[] getTrans() {
        return trans;
    }

    public void setTrans(String[] trans) {
        this.trans = trans;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Objetos{");
        sb.append("tam=").append(tam);
        sb.append(", fita=").append(Arrays.toString(fita));
        sb.append(", trans=").append(Arrays.toString(trans));
        sb.append('}');
        return sb.toString();
    }
}
