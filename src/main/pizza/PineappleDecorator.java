package pizza;

class PineappleDecorator extends PizzaDecorator{

    PineappleDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice() + 0.79;
    }

    @Override
    public double getCalories() {
        return this.getProduct().getCalories() + 24;
    }
}
