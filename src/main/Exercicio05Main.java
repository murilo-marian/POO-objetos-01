package main;

import objects.Exercicio05Menu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cachorro = 0;
        int bauru = 0;
        int baurovo = 0;
        int ham = 0;
        int cheese = 0;
        int refri = 0;

        int cod;
        int quant;

        System.out.print("Digite o código do item (0 para sair): ");
        cod = entrada.nextInt();
        do {
            System.out.print("Digite a quantidade: ");
            quant = entrada.nextInt();
            switch (cod) {
                case 100 -> cachorro += quant;
                case 101 -> bauru += quant;
                case 102 -> baurovo += quant;
                case 103 -> ham += quant;
                case 104 -> cheese += quant;
                case 105 -> refri += quant;
                default -> System.out.println("Código Inválido");
            }
            System.out.print("Digite o código do item (0 para sair): ");
            cod = entrada.nextInt();
        } while (cod != 0);

        Exercicio05Menu pedido = new Exercicio05Menu(cachorro, bauru, baurovo, ham, cheese, refri);

        System.out.println(pedido);
    }
}
