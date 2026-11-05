package questao3;

public class Cha extends Bebida {
    public Cha() {
        this.descricao = "Chá";
    }

    @Override
    public double getPreco() {
        return 4.50;
    }
}
