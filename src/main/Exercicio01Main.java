package main;

import objects.Exercicio01Usuario;

public class Exercicio01Main {
    public static void main(String[] args) {
        Exercicio01Usuario p = new Exercicio01Usuario("Murilo", "Marian");
        System.out.println(p.toCompleto());
    }
}
