package questao1;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        mouse.adicionarObservador(compras);
        mouse.adicionarObservador(vendas);
        mouse.adicionarObservador(auditoria);

        System.out.println(" 10 -> 8 (só auditoria reage)");
        mouse.setQuantidade(8);

        System.out.println(" 8 -> 4 (compras alerta)");
        mouse.setQuantidade(4);

        System.out.println(" 4 -> 4 (nada muda, ninguém é avisado) ");
        mouse.setQuantidade(4);

        System.out.println(" 4 -> 0 (zerou) ");
        mouse.setQuantidade(0);

        System.out.println("0 -> 12 (vendas alerta: voltou ao estoque)");
        mouse.setQuantidade(12);
    

        System.out.println(" Compras removida");
        mouse.removerObservador(compras);
        System.out.println(" 12 -> 3 (compras não alerta mais)");
        mouse.setQuantidade(3);

        System.out.println("Registros da auditoria: " + auditoria.getRegistros().size());
    }
}



















