public class Tomato extends TopingDecorator{
    Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Tomato";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+ 100;
    }
}
