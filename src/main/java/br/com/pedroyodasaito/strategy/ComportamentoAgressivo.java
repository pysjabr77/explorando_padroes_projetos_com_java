package br.com.pedroyodasaito.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo agressivamente...");
    }
}
