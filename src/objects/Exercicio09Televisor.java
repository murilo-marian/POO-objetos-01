package objects;

public class Exercicio09Televisor {
    private int canal;
    private int volume;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal < 30) {
            this.canal = canal;
        } else {
            this.canal = 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Exercicio09Televisor(int canal, int volume) {
        this.canal = canal;
        if(volume >= 0 && volume < 100) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }
    }
}
