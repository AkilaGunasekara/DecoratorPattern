public class Chicken extends TopingDecorator{
    Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Chicken ";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() +  700;
    }
}
