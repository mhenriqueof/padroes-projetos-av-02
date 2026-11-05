package questao1;

public class VendasObserver implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, boolean veioDeZero) {
        if (veioDeZero) {
            System.out.println("[VENDAS] PRODUTO DISPONÍVEL: '" + nomeProduto + "' voltou a ter estoque (" + novaQuantidade + ")");
        }
    }
}
