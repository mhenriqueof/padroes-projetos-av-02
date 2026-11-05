package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private Integer ultimaQuantidadeAntesDeZerar = null;
    private final List<EstoqueObserver> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarObservador(EstoqueObserver obs) {
        if (obs != null && !observadores.contains(obs)) {
            observadores.add(obs);
        }
    }

    public void removerObservador(EstoqueObserver obs) {
        observadores.remove(obs);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return;
        }

        // Atualiza o rastreamento do estado "zerado"
        if (this.quantidade == 0 && novaQuantidade > 0) {
            this.ultimaQuantidadeAntesDeZerar = 0;
        } else if (this.quantidade > 0) {
            this.ultimaQuantidadeAntesDeZerar = null;
        }

        this.quantidade = novaQuantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (EstoqueObserver obs : observadores) {
            obs.atualizar(nome, quantidade, ultimaQuantidadeAntesDeZerar != null);
        }
        
        // Reseta o flag após a notificação para não disparar novamente em mudanças subsequentes
        if (this.quantidade > 0) {
            this.ultimaQuantidadeAntesDeZerar = null;
        }
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
}
