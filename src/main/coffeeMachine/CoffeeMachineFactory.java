package coffeeMachine;

public class CoffeeMachineFactory {

    Coffee getCoffee(String cofe){
        if(cofe == null){
            return null;
        }
        if(cofe.equals("Coffe Late")){
            return new CoffeLatte();
            
        } else if (cofe.equals("Americano")) {
            return new Americano();
            
        } else if (cofe.equals("Cappuccino")) {
            return new Cappuccino();

        } else if (cofe.equals("Espresso")) {
            return new Espresso();
        }
        return null;
    }
}
