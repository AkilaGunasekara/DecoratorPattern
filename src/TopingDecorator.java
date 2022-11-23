public abstract class TopingDecorator implements Pizza{
    protected Pizza pizza;

    TopingDecorator(Pizza pizza){
        this.pizza=pizza;

    }
}
