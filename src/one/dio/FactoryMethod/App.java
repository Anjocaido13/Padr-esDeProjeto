package one.dio.FactoryMethod;

import one.dio.singleton.main;

public class App {
    public static void main(String[] args) {
        criarItem madeItemA = new criarItemA();
        Item ItemA = madeItemA.criarItem();
        System.out.println(ItemA.getDescricao());

        criarItem madeItemB = new criarItemB();
        Item ItemB = madeItemB.criarItem();
        System.out.println(ItemB.getDescricao());

    }

}
