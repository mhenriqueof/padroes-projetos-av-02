package questao2;

public class TarifaConveniado implements CalculadoraTarifa {
    private static final int MINUTOS_GRATUITOS = 30;
    private static final double VALOR_POR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 0.20; // 20% de desconto

    @Override
    public String getNomePerfil() {
        return "CONVENIADO";
    }

    @Override
    public double calcular(int tempoMinutos) {
        if (tempoMinutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }
        
        int minutosCobrados = tempoMinutos - MINUTOS_GRATUITOS;
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorBase = horasIniciadas * VALOR_POR_HORA;
        
        return valorBase * (1 - DESCONTO_PERCENTUAL);
    }
}
