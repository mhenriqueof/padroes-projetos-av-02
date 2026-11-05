package questao3;

public class Calda extends ComplementoDecorator {
    public Calda(Bebida bebidaBase) {
        super(bebidaBase);
        this.descricao = "Calda de Chocolate";
    }

    @Override
    public double getPrecoAdicional() {
        return 1.80;
    }
}
