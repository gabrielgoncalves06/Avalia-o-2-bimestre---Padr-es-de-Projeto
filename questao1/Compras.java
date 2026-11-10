package questao1;

public class Compras implements Observador {
    private static final int LIMITE = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if  (novaQuantidade < LIMITE) {
            System.out.println("[cOMPRAS] ALERTA: estoque baixo de " + nomeProduto
                    + " (" + novaQuantidade + " un.)");
        }
    }


}
















