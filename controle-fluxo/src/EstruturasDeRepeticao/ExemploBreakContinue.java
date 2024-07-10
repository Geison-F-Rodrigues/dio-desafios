package EstruturasDeRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 14; numero++){
            if(numero == 11)
                continue;

            System.out.println(numero);
        }
    }
}
