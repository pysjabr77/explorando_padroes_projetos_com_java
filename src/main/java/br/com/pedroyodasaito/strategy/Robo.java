package br.com.pedroyodasaito.strategy;

public class Robo {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void executarMovimento() {
        comportamento.mover();
    }

}
