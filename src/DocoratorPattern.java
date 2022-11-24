import java.util.ArrayList;
import java.util.Scanner;

public class DocoratorPattern {
    public static void main(String[] args) {
//        Pizza Basic = new BasicPizza();
//        System.out.println("Type :"+ Basic.getDescription() + "Price :" + Basic.getPrice());
//
//        Pizza Cpizza = new Chicken(Basic);
//        System.out.println("Type :"+ Cpizza.getDescription() + "Price :" + Cpizza.getPrice());
//
//        Pizza Cheepizza = new Cheese(Basic);
//        System.out.println("Type : " + Cheepizza.getDescription() + "Price :" + Cheepizza.getPrice());
//
//        Pizza Spizza = new Sausage(Basic);
//        System.out.println("Type : " + Spizza.getDescription() + "Price :" + Spizza.getPrice());
//
//        Pizza Tpizza = new Tomato(Basic);
//        System.out.println("Type : " + Tpizza.getDescription() + "Price :" + Tpizza.getPrice());

        ArrayList<String> Arr = new ArrayList<String>();

        System.out.println("Enter Your Choices \n1.Chicken \n2.Cheese \n3.Beef");
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        for (int i = 0; i < 3; i++) {
            Arr.add(sc.nextLine());
        }
        Pizza pizza2 = new BasicPizza();
        for (String i: Arr) {
            switch (i){
                case "1":
                    pizza2 = new Tomato(pizza2);
                    break;

                case "2":
                    pizza2 = new Sausage(pizza2);
                    break;
                case "3":
                    pizza2 = new Cheese(pizza2);
                    break;
                case "4":
                    pizza2 = new Chicken(pizza2);
                    break;
            }

        }
        System.out.println(pizza2.getDescription());
        System.out.println(pizza2.getPrice());

    }


}
