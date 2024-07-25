package ExerciciosExemplos;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Lero o total de eleitores
        System.out.println("Digite o numero total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.println("Digite o numero total de votos em branco: ");
        int votosBrancos = sc.nextInt();

        System.out.println("Digite o numero total de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.println("Digite o numero total de votos validos: ");
        int votosValidos = sc.nextInt();
        
        // calcular os percentuais
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100; 
        double percentualNulos = (double) votosNulos / totalEleitores * 100; 
        double percentualValidos = (double) votosValidos / totalEleitores * 100; 

        // exibir os resultados
        System.out.printf("Percentual de votos Brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos Nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos Válidos: %.2f%%\n", percentualValidos);
        
        sc.close();
    }
}
