package pizza;

public class Main {
    public static void main(String[] args) {
        Pizza salamiPizza = new PizzaSalami();
        System.out.println("name = " + salamiPizza.getName() + " and price" + salamiPizza.getPrice() + " and calories : " + salamiPizza.getCalories());
        IProduct salamiPizzaFamilySize = new FamilySizePizzaDecorator(salamiPizza);
        System.out.println(salamiPizza.getName() + " in family size... \n New calories = " + salamiPizzaFamilySize.getCalories());
        System.out.println("New Price = " + salamiPizzaFamilySize.getPrice());
        IProduct salamiPizzaWithOnionsTopping = new OnionsDecorator(salamiPizza);
        System.out.println("Adding Onions Topping... \n New calories = " + salamiPizzaWithOnionsTopping.getCalories());
        System.out.println("New Price = " + salamiPizzaWithOnionsTopping.getPrice());

        Pizza hawaiianPizza = new PizzaHawaiian();
        System.out.println("Pizza name: "+ hawaiianPizza.getName());
        IProduct hawPizzaWithPineapple = new PineappleDecorator(hawaiianPizza);
        System.out.println("Adding Pineapple topping... \nNew Calories = " + hawPizzaWithPineapple.getCalories());
        System.out.println("New price = " + hawPizzaWithPineapple.getPrice());
    }
}