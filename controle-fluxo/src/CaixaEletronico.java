public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 255.0;
        double valorSolicitado = 220.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            
            System.out.println(saldo);
        }
    }
}
