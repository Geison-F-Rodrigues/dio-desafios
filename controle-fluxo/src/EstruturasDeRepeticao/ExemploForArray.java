package EstruturasDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arryas o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){

            System.out.println("O alunos no indice x = " + x + " é " + alunos[ x ] );
        }
    }
}
