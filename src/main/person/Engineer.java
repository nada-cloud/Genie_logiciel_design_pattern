package person;

public class Engineer extends Person{

    public Engineer(){
        this.setTitle("Engineer");
        this.setName(super.getName());
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
