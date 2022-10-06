package main;

import objects.Exercicio06Square;

import java.util.Scanner;

public class Exercicio06Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado");
        Exercicio06Square quadrado = new Exercicio06Square(entrada.nextInt());
        quadrado.toString();
    }
}
