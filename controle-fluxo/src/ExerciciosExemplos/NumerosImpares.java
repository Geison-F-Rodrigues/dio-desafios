package ExerciciosExemplos;

import java.util.Locale;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int total = 99;
        
        while (x < total) {
            x += 2;
            System.out.println(x);
        }

        sc.close();
    }
}
