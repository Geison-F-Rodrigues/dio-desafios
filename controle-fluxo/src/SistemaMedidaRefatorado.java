import java.util.Scanner;

public class SistemaMedidaRefatorado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a sigla do tamnaho: ");
        String sigla = sc.nextLine();

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDÃO!!!!");
                break;

            }default:
                System.out.println("INDEFINIDO!");

        }
        sc.close();
    }
}
