package questao3;

public class Main {
    public static void main(String[] args) {
        // Pedido 1: Espresso simples
        Bebida pedido1 = new Espresso();
        imprimirPedido(pedido1);

        // Pedido 2: Chá com Leite e Chantilly
        Bebida pedido2 = new Cha();
        pedido2 = new Leite(pedido2);
        pedido2 = new Chantilly(pedido2);
        imprimirPedido(pedido2);

        // Pedido 3: Espresso com Calda, Leite e mais uma Calda
        Bebida pedido3 = new Espresso();
        pedido3 = new Calda(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Calda(pedido3);
        imprimirPedido(pedido3);
    }

    private static void imprimirPedido(Bebida bebida) {
        System.out.printf("Descrição: %s | Preço Total: R$ %.2f%n", 
                bebida.getDescricao(), bebida.getPreco());
    }
}
