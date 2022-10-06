package main;

import objects.Exercicio04Sal;

import java.util.Scanner;

public class Exercicio04Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorHora;
        int horaMensal;

        System.out.println("Qual o seu salário por hora trabalhada?");
        valorHora = entrada.nextInt();
        System.out.println("Qual o número de horas trabalhadas por mês?");
        horaMensal = entrada.nextInt();

        Exercicio04Sal salario = new Exercicio04Sal(valorHora, horaMensal);

        System.out.println("Salario Bruto: " + salario.getSal());
        System.out.println("INSS: " + salario.getInss());
        System.out.println("Imposto de renda: " + salario.getIr());
        System.out.println("Sindicato: " + salario.getSindicato());
        System.out.println("Salário Líquido: " + salario.getSalFinal());
    }
}
