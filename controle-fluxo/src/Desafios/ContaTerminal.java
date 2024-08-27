package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*  Olá, Seja Bem-Vindo ao nosso   *");
        System.out.println("*             Banco!              *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        System.out.println();
        System.out.println("Vamos criar uma conta");
        System.out.println("         |  ");
        System.out.println("         |  ");
        System.out.println("         v  ");
        System.out.println("");
        System.out.print("Por Favor, digite o nome do Titular da Conta: ");
        String nomeTitular = sc.nextLine();
        System.out.println("--------------------------------------------------");
        
        System.out.print("Por favor, Digite o numero da Agência: ");
        String agencia = sc.nextLine();
        System.out.println("--------------------------------------------------");

        System.out.print("Por favor, Digite o numero da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("--------------------------------------------------");

        System.out.print("Por Favor, digite o Saldo Inicial: ");
        double saldoInicial = sc.nextDouble();
        System.out.println("--------------------------------------------------");
        System.out.println("");

        String mensagem = ("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +   ", conta " + numeroConta + " e seu saldo de " + saldoInicial + " já está disponível para saque.");
        System.out.println(mensagem);

        sc.close();
    }
}
