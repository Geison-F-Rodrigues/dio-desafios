package ExerciciosExemplos;

import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Perguntar o número de alunos na turma
        System.out.println("Quantos alunos há na turma?");
        int numeroDeAlunos = sc.nextInt();

        // Criar uma matriz para armazenar as notas de cada aluno
        double[][] notas = new double[numeroDeAlunos][];

        // Ler as notas de cada aluno
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Quantas notas o aluno " + (i + 1) + " tem?");
            int numeroDeNotas = sc.nextInt();
            notas[i] = new double[numeroDeNotas];

            for (int j = 0; j < numeroDeNotas; j++) {
                System.out.println("Insira a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Calcular a soma e a média das notas para cada aluno e da turma
        double somaTotal = 0;
        int totalDeNotas = 0;

        for (int i = 0; i < numeroDeAlunos; i++) {
            double somaAluno = 0;
            for (double nota : notas[i]) {
                somaAluno += nota;
            }
            double mediaAluno = somaAluno / notas[i].length;
            System.out.println("A média do aluno " + (i + 1) + " é: " + mediaAluno);

            somaTotal += somaAluno;
            totalDeNotas += notas[i].length;
        }

        // Calcular a média da turma
        double mediaTurma = somaTotal / totalDeNotas;
        System.out.println("A média da turma é: " + mediaTurma);

        sc.close();
    }
}