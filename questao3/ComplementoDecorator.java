package questao3;

public abstract class ComplementoDecorator extends Bebida {
    protected final Bebida bebidaBase;

    public ComplementoDecorator(Bebida bebidaBase) {
        this.bebidaBase = bebidaBase;
    }

    @Override
    public String getDescricao() {
        return bebidaBase.getDescricao() + ", " + this.descricao;
    }

    @Override
    public double getPreco() {
        return bebidaBase.getPreco() + this.getPrecoAdicional();
    }

    public abstract double getPrecoAdicional();
}
