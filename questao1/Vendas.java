package questao1;
import java.util.Set;
import java.util.HashSet;


public class Vendas implements Observador {
    private final  Set<String> zerados = new HashSet<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0)  {
            zerados.add(nomeProduto);
        } else if (zerados.remove(nomeProduto)) {     
            System.out.println("[VENDAS]  "  + nomeProduto + " voltou ao estoque ("
                    +  novaQuantidade + " un.)");
        }


    }
}















