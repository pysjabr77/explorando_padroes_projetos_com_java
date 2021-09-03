package br.com.pedroyodasaito.singleton;

import java.util.Objects;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (Objects.isNull(instancia)) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
