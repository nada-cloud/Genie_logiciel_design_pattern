public abstract class ToppingDecorator extends Pizza {
    private IProduct aProduct;

    public IProduct getProduct() {
        return aProduct;
    }

    protected void setProduct(IProduct Product) {
        this.aProduct = Product;
    }
}
