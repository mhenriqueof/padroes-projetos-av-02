package questao1;

public class ComprasObserver implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, boolean veioDeZero) {
        if (novaQuantidade < 5) {
            System.out.println("[COMPRAS] ALERTA: Estoque de '" + nomeProduto + "' abaixo de 5 unidades (" + novaQuantidade + ")");
        }
    }
}
