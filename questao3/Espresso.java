package questao3;

public class Espresso extends Bebida {
    public Espresso() {
        this.descricao = "Espresso";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}
