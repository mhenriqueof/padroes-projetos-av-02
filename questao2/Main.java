package questao2;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("ABC-1234", 150); // 2 horas e 30 minutos

        // Teste com os três perfis
        ticket.setCalculadora(new TarifaRotativo());
        System.out.printf("Perfil %s: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setCalculadora(new TarifaMensalista());
        System.out.printf("Perfil %s: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setCalculadora(new TarifaConveniado());
        System.out.printf("Perfil %s: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        // Demonstração de troca de perfil em tempo de execução (RQ2.6)
        System.out.println("\n--- Trocando perfil do mesmo tíquete ---");
        ticket.setCalculadora(new TarifaRotativo());
        System.out.printf("Novo cálculo (%s): R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());
    }
}
