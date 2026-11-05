package questao1;

public class AuditoriaObserver implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, boolean veioDeZero) {
        System.out.println("[AUDITORIA] Estoque alterado: '" + nomeProduto + "' -> " + novaQuantidade + " unidades");
    }
}
