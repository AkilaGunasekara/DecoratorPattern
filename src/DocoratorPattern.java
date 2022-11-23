public class DocoratorPattern {
    public static void main(String[] args) {
        Pizza Basic = new BasicPizza();
        System.out.println("Type :"+ Basic.getDescription() + "Price :" + Basic.getPrice());

        Pizza Cpizza = new Chicken(Basic);
        System.out.println("Type :"+ Cpizza.getDescription() + "Price :" + Cpizza.getPrice());


    }
}
