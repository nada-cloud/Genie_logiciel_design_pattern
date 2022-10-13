public class PizzaHawaiian extends Pizza {

    public PizzaHawaiian(){
        this.setName("Hawaiian");
    }

    @Override
    public double getPrice() {
        return 6.49;
    }

    @Override
    public double getCalories() {
        return 1024;
    }
}
