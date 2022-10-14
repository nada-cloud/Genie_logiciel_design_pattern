package pizza;

class SalamiDecorator extends PizzaDecorator{


    SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return this.getProduct().getPrice()+0.99;
    }

    @Override
    public double getCalories() {
        return this.getProduct().getCalories() + 86;
    }
}
