package questao2;

public class Conveniado implements PoliticaCobranca {
    
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.00;
    private static final double DESCONTO = 0.25;        

    @Override
    public double calcular(int minutos) {
        int excedente = Math.max(0, minutos - MINUTOS_GRATIS);
        int horasIniciadas = ( exscedente + 59) / 60;
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO);
    }


}















