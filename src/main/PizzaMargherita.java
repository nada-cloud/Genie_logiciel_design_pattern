public class PizzaMargherita extends Pizza {

    public PizzaMargherita(){
        this.setName("Margherita");
    }

    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public double getCalories() {
        return 1104;
    }
}
