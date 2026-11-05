package questao3;

public class Chantilly extends ComplementoDecorator {
    public Chantilly(Bebida bebidaBase) {
        super(bebidaBase);
        this.descricao = "Chantilly";
    }

    @Override
    public double getPrecoAdicional() {
        return 2.00;
    }
}
