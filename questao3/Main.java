package questao3;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());
        Bebida pedido2 = new Calda(new Cha());
        Bebida pedido3 = new Chantilly(new Leite(new Leite(new Espresso())));   // Leite repetido

        imprimir(pedido1); 
        imprimir(pedido2);

        imprimir(pedido3);
    }

    private static void imprimir(Bebida b) {
        System.out.println(b.getDescricao() + " = R$ " + b.getPreco());
    }
    
}









