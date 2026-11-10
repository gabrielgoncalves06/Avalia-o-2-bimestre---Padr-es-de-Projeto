package questao2;

public class Ticket {
    private final String placa;
    private final int minutos;
    private PoliticaCobranca politica;

    public Ticket(String placa, int minutos, PoliticaCobranca politica) {  
        this.placa = placa;
        this.minutos = minutos;
        this.politica = politica;
    }


    public void setPolitica(PoliticaCobranca politica) {                    
        this.politica = politica;
    }

    public double calcularValor() {
         return politica.calcular(minutos);                                 
    }

    public String getPlaca()  {
         return placa; 
    }
    public int getMinutos()  {   
        return minutos; 
    }
}





