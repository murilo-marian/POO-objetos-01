package main;
import objects.Exercicio03Calc;
import java.util.Scanner;

public class Exercicio03Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

       Exercicio03Calc num = new Exercicio03Calc(n1, n2);
        System.out.println("Adição: " + num.calcSum());
        System.out.println("Subtração: " + num.calcSub());
        System.out.println("Multiplicação: " + num.calcMultiply());
        System.out.println("Divisão: " + num.calcDiv());
    }
}
