class OnionsDecorator extends PizzaDecorator {
    public OnionsDecorator(Pizza pizza) {
        super(pizza);

    }
    @Override
    public double getCalories() {
        return this.getProduct().getCalories() + 22;
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice() + 0.69;
    }
}
