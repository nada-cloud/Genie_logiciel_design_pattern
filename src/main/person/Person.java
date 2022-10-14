package person;

public abstract class Person {
    private String aName;

    private String clothes;
    private String atitle;

    public String getName() {
        return aName;
    }

    protected void setName(String aName) {
        this.aName = aName;
    }

    public String getTitle() {
        return atitle;
    }

    public String getClothes(){
        return clothes;
    }

    public void setTitle(String atitle) {
        this.atitle = atitle;
    }


}
