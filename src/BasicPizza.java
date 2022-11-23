public class BasicPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Basic Price with ";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
