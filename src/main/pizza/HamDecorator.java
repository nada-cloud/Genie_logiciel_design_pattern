package pizza;

class HamDecorator extends PizzaDecorator{
    HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCalories() {
        return this.getProduct().getCalories() + 35;
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice() + 0.99;
    }
}
