package questao2;

import java.util.Locale;

public class Main {
    public static void main( String[] args )  {
        Ticket ticket = new Ticket("ABC - 1234", 135, new Rotativo());
        System.out.println(" Placa " + ticket.getPlaca() + ", permanencia: "
                + ticket.getMinutos() + " min");

        System.out.println(linha(" Rotativo", ticket.calcularValor()));
 
        ticket.setPolitica(new Mensalista());
        System.out.println(linha(" Mensalista", ticket.calcularValor()));

        ticket.setPolitica(new Conveniado());
        System.out.println(linha(" Conveniado", ticket.calcularValor()));
    }



    private static String linha(String perfil, double valor) {
         return perfil + " R$  " +  valor;
    }
}







