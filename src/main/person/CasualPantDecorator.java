package person;

import pizza.Pizza;

public class CasualPantDecorator extends PersonDecorator {

    CasualPantDecorator(Person person) {
        super(person);
    }

    @Override
    public String getClothes() {
        return "Casual Pant";
    }

}
