import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua Nota: ");
        double nota = sc.nextDouble();
        
        String resultado = nota >= 7 ? "Aprovado!" : ((nota  >= 5) && ( nota < 7)) ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);

        sc.close();
    }
}
 