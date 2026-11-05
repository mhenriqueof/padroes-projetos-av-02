package questao1;

public class Main {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular Samsung", 10);

        ComprasObserver compras = new ComprasObserver();
        VendasObserver vendas = new VendasObserver();
        AuditoriaObserver auditoria = new AuditoriaObserver();

        celular.adicionarObservador(compras);
        celular.adicionarObservador(vendas);
        celular.adicionarObservador(auditoria);

        System.out.println("--- Alterando para 3 unidades ---");
        celular.setQuantidade(3);

        System.out.println("\n--- Alterando para 0 unidades ---");
        celular.setQuantidade(0);

        System.out.println("\n--- Alterando para 5 unidades (deverá disparar Vendas) ---");
        celular.setQuantidade(5);

        System.out.println("\n--- Removendo Vendas e alterando para 2 unidades ---");
        celular.removerObservador(vendas);
        celular.setQuantidade(2);
    }
}
