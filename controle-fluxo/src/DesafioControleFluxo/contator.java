package DesafioControleFluxo;

import java.util.Scanner;

public class contator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO PARÂMETRO: ");
        int parametroUm = sc.nextInt();
        System.out.print("DIGITE O SEGUNDO PARÂMETRO: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInavalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInavalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInavalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
