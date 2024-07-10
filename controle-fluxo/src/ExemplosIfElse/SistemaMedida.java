package ExemplosIfElse;
import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sigla desejada para seu tamanho: ");
        String sigla = sc.nextLine();

        if (sigla.equals("P"))
            System.out.println("PEQUENO");

        else if (sigla.equals("M"))
            System.out.println("MÉDIO");

        else if (sigla.equals("G"))
            System.out.println("GRANDE");

        else
            System.out.println("INDEFINIDO!");

        sc.close();
    }
}