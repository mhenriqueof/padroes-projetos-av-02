package questao3;

public class Leite extends ComplementoDecorator {
    public Leite(Bebida bebidaBase) {
        super(bebidaBase);
        this.descricao = "Leite";
    }

    @Override
    public double getPrecoAdicional() {
        return 1.50;
    }
}
