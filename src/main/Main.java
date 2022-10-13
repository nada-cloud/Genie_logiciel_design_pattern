public class Main {
    public static void main(String[] args) {
        Pizza salamiPizza = new PizzaSalami();
        IProduct salamiPizzaOption = new OnionsDecorator(salamiPizza);
        System.out.println("calories = " + salamiPizzaOption.getCalories());
        System.out.println("name = " + salamiPizzaOption.getName());
    }
}