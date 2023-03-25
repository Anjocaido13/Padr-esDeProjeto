package one.dio.FactoryMethod;

public class criarItemA extends criarItem {

    @Override
    public Item criarItem() {
        return new ItemA();
    }

}