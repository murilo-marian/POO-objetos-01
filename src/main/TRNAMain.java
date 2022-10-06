package main;

import objects.TRNA;

import java.util.Scanner;

public class TRNAMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        entrada.nextLine();
        String[] fita = new String[tam];

        TRNA trna = new TRNA(tam);

        for (int i = 0; i < fita.length; i++) {
            boolean teste = true;
            do {
                System.out.println("Informe o TNA (A, T, G, C)");
                fita[i] = String.valueOf(entrada.nextLine().charAt(0)).toUpperCase();
                if (!fita[i].equals("A") && !fita[i].equals("T") && !fita[i].equals("G") && !fita[i].equals("C")) {
                    System.out.println("Escreva um valor permitido");
                } else {
                    teste = false;
                }
            } while (teste);
        }

        trna.setFita(fita);

        trna.transcricao();
        for (String s : trna.getTrans()) {
            System.out.println(s);
        }
    }
}
