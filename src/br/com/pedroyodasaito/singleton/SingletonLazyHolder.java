package br.com.pedroyodasaito.singleton;

/*

    @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>

    This pattern is beneficial for at least 3 reasons:

        1.Static factory
        2.Lazy initialization
        3.Thread safe

 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }

}
