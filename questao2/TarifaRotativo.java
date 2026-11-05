package questao2;

public class TarifaRotativo implements CalculadoraTarifa {
    private static final double VALOR_POR_HORA = 10.00;

    @Override
    public String getNomePerfil() {
        return "ROTATIVO";
    }

    @Override
    public double calcular(int tempoMinutos) {
        int horasIniciadas = (int) Math.ceil(tempoMinutos / 60.0);
        return horasIniciadas * VALOR_POR_HORA;
    }
}
