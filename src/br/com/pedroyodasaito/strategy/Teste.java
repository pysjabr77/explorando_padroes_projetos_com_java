package br.com.pedroyodasaito.strategy;

public class Teste {

    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.executarMovimento();
        robo.executarMovimento();

        robo.setComportamento(defensivo);

        robo.executarMovimento();
        robo.executarMovimento();
        robo.executarMovimento();

        robo.setComportamento(agressivo);

        robo.executarMovimento();
        robo.executarMovimento();
        robo.executarMovimento();
        robo.executarMovimento();
    }

}
