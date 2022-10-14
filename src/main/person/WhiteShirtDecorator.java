package person;

public class WhiteShirtDecorator extends PersonDecorator {

    public WhiteShirtDecorator(Person person){
        super(person);
    }

    @Override
    public String getClothes() {
        return "White Shirt";
    }
}
