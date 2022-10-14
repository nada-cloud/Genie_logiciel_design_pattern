package pizza;

public class PizzaSalami extends Pizza{
    
    public PizzaSalami() {
        this.setName("Salami pizza");
    }
    @Override
    public double getCalories() {
        return 1160;
    }
    @Override
    public double getPrice() {
        return 5.99;
    }
}
