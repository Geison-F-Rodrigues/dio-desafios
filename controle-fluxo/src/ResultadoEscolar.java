public class ResultadoEscolar {
    public static void main(String[] args) {
        
        double nota = 5.6;

        if(nota >= 7)
            System.out.println("Aluno Aprovado, Parabéns!");
            
            else if (nota >=5 && nota < 7)
                System.out.println("Recuperação!");

            else 
            System.out.println("Aluno Reprovado, Quem sab na próxima!");
            
    }
}