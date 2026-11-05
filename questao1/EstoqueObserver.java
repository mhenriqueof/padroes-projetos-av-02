package questao1;

public interface EstoqueObserver {
    void atualizar(String nomeProduto, int novaQuantidade, boolean veioDeZero);
}
