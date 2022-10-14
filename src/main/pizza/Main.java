package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza salamiPizza = new PizzaSalami();
        IProduct salamiPizzaOption = new OnionsDecorator(salamiPizza);
        System.out.println("calories = " + salamiPizzaOption.getCalories());
        System.out.println("name = " + salamiPizzaOption.getName());

        Pizza hawaiianPizza = new PizzaHawaiian();
        System.out.println("pizza.Pizza: "+ hawaiianPizza.getName());
        IProduct hawPizzaWithPineapple = new PineappleDecorator(hawaiianPizza);
        System.out.println("calories = " + hawPizzaWithPineapple.getCalories());
        System.out.println("price = " + hawPizzaWithPineapple.getPrice());
    }
}