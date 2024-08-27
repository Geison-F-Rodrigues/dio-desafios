
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] alunos = { "CAMILA", "lUCAS", "BRUNA", "PEDRO" };

        try{
        double media = calculaMediaDaTurma(alunos, sc);
        System.out.printf(Locale.US, "Média da turma: %.1f", media);
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada Inválida. Certifique-se de digitar um número.");
        }finally{
            sc.close();  // Certifica-se de que o Scanner será fechado
        }
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            while (true) { // Loop para continuar pedindo a nota até que seja válida
                try{
                    System.out.printf("Nota do aluno %s: ", aluno);
                    double nota = scanner.nextDouble();
                    soma += nota;
                    break; // Sai do loop se a for válida
                }catch (InputMismatchException e){
                    System.out.println("Entrada Inválida. Por favor, insira um número.");
                    scanner.next(); //limpa a entrada inválida
                }
            }
        }
        
        return soma / alunos.length;
    }
}
