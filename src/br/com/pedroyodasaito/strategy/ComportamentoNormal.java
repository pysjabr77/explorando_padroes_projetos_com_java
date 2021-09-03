package br.com.pedroyodasaito.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo normalmente...");
    }
}
