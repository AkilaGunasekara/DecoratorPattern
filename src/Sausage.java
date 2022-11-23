public class Sausage extends TopingDecorator{
    Sausage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Sausage";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 600;
    }
}
