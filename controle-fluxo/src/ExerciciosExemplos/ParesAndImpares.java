package ExerciciosExemplos;

import java.util.Scanner;

public class ParesAndImpares {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números pares de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nNúmeros ímpares de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();

    }
}
