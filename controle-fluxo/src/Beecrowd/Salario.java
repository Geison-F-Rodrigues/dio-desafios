package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de Horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor da Hora trabalhada: ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
        sc.close();
    }
}
