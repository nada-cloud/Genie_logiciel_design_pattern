package pizza;

public class FamilySizePizzaDecorator extends PizzaDecorator{


    FamilySizePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice()+4.15;
    }

    @Override
    public double getCalories() {
        return this.getProduct().getCalories() * 1.95;
    }


}
