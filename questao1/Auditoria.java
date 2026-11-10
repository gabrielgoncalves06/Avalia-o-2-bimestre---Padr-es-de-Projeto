package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements Observador {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String linha = " produto= " + nomeProduto + "  novaQuantidade=" + novaQuantidade;
        registros.add(linha);
        System.out.println(" [AUDITORIA] " + linha);
    }

    public  List<String> getRegistros() {
         return registros; }



}












