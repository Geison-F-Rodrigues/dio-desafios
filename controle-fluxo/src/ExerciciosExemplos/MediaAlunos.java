package ExerciciosExemplos;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("MÉDIA DAS NOTAS:");
        System.out.println("----------------");
        System.out.println("");

        System.out.print("Digite o numero de alunos: ");
        int numAlunos = sc.nextInt();
        int contador = 0;
        double soma = 0.0;

       while (contador < numAlunos) {
        System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
        double nota = sc.nextDouble();
        soma += nota;
        contador++;
        
        }

        System.out.println("Soma das notas: " + soma);

        sc.close();
    }
}
