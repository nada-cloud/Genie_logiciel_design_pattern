public abstract class PizzaDecorator extends Pizza {
    private IProduct aProduct;

    PizzaDecorator(Pizza pizza) {
        aProduct = pizza;
    }

    public IProduct getProduct() {
        return aProduct;
    }

    protected void setProduct(IProduct Product) {
        this.aProduct = Product;
    }
}
