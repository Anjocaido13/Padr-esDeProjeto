package one.dio.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // construtor privado
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void infoSingleton() {
        System.out.println(
                "O padrão Singleton é utilizado quando se deseja garantir que uma classe tenha apenas uma única instância em toda a aplicação. Isso é útil em situações onde é importante controlar o acesso e a manipulação de um objeto de uma classe específica.");
        System.out.println("Espero que tenham gostado <3 :)");
    }

}