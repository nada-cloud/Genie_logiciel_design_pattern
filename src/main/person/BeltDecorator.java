package person;

public class BeltDecorator extends PersonDecorator{

    BeltDecorator(Person person){
        super(person);
    }

    @Override
    public String getClothes() {
        return "Belt";
    }
}
