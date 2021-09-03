package br.com.pedroyodasaito.singleton;

public class Teste {

    public static void main(String[] args) {

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println(singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy2);

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1);
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2);

        SingletonLazyHolder singletonLazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder1);
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder2);
    }

}
