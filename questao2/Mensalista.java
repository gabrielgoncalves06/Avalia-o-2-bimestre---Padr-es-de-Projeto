package questao2;

public class Mensalista implements PoliticaCobranca {
    private static final  double VALOR_MENSAL = 250.00;

    @Override
    public double calcular(int minutos) {
         return VALOR_MENSAL;
    }
}













