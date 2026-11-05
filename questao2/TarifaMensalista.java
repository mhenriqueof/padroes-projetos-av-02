package questao2;

public class TarifaMensalista implements CalculadoraTarifa {
    private static final double VALOR_FIXO = 250.00;

    @Override
    public String getNomePerfil() {
        return "MENSALISTA";
    }

    @Override
    public double calcular(int tempoMinutos) {
        return VALOR_FIXO;
    }
}
