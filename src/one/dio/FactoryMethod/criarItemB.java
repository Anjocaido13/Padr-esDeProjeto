package one.dio.FactoryMethod;

public class criarItemB extends criarItem {

    @Override
    public Item criarItem() {
        return new ItemB();
    }

}