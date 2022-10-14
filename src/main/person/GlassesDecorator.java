package person;

public class GlassesDecorator extends PersonDecorator{

    public GlassesDecorator(Person person){
        super(person);
    }

    @Override
    public String getClothes() {
        return "Glasses";
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }
}
