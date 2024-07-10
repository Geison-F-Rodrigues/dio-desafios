package EstruturasDeRepeticao;

public class ExemploForEach {
    public static void main(String[] args) {
        //em arryas o indice inicia em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (String aluno : alunos){

            System.out.println("Nome do aluno: " + aluno );
        }
    }
}
