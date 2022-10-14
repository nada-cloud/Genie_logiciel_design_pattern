package person;

public class Teacher extends Person {

    public Teacher(String name){
        this.setTitle("Teacher");
        this.setName(name);
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
