public class Cheese extends TopingDecorator {

    Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Cheese";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 500;
    }
}
