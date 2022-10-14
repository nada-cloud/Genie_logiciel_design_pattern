package coffeeMachine;

import pizza.*;

public class main {

    public static void main(String[] args) {
       CoffeeMachineFactory coffeeMachine = new CoffeeMachineFactory();
       Coffee coffee = coffeeMachine.getCoffee("Espresso");
        coffee.getCoffee();
       System.out.println(coffee.coffee);

        Coffee coffee2 = coffeeMachine.getCoffee("Coffe Late");
        coffee2.getCoffee();
        System.out.println(coffee2.coffee);
    }
}
