package person;

import pizza.IProduct;
import pizza.Pizza;

public abstract class PersonDecorator extends Person {

    private Person person;

    PersonDecorator(Person person) {
        person = person;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Person getPerson() {
        return person;
    }

    protected void setPerson(Person person) { // <=> wear function
        this.person = person;
    }
}
