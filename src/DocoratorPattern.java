public class DocoratorPattern {
    public static void main(String[] args) {
        Pizza Basic = new BasicPizza();
        System.out.println("Type :"+ Basic.getDescription() + "Price :" + Basic.getPrice());

        Pizza Cpizza = new Chicken(Basic);
        System.out.println("Type :"+ Cpizza.getDescription() + "Price :" + Cpizza.getPrice());

        Pizza Cheepizza = new Cheese(Basic);
        System.out.println("Type : " + Cheepizza.getDescription() + "Price :" + Cheepizza.getPrice());

        Pizza Spizza = new Sausage(Basic);
        System.out.println("Type : " + Spizza.getDescription() + "Price :" + Spizza.getPrice());

        Pizza Tpizza = new Tomato(Basic);
        System.out.println("Type : " + Tpizza.getDescription() + "Price :" + Tpizza.getPrice());


    }
}
