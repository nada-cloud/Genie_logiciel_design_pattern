class CheeseDecorator extends PizzaDecorator{
    CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCalories() {
        return this.getProduct().getCalories() + 92;
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice() + 0.69;
    }
}
