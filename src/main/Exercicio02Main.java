package main;
import objects.Exercicio02Calc;

import java.util.Scanner;

public class Exercicio02Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int troca;

        if (n1 > n2) {
            troca = n1;
            n1 = n2;
            n2 = troca;
            System.out.println("Os números foram invertidos");
        }

        Exercicio02Calc teste = new Exercicio02Calc(n1, n2);

        System.out.println(teste.mostraNumero());
    }
}
