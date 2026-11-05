package questao2;

public class Ticket {
    private final String placa;
    private int tempoMinutos;
    private CalculadoraTarifa estrategia;

    public Ticket(String placa, int tempoMinutos) {
        if (placa == null || placa.isBlank()) throw new IllegalArgumentException("Placa inválida");
        if (tempoMinutos < 0) throw new IllegalArgumentException("Tempo não pode ser negativo");
        
        this.placa = placa;
        this.tempoMinutos = tempoMinutos;
    }

    public void setCalculadora(CalculadoraTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de tarifa definida para o tíquete " + placa);
        }
        return estrategia.calcular(tempoMinutos);
    }

    public String getPlaca() { return placa; }
    public int getTempoMinutos() { return tempoMinutos; }
}
