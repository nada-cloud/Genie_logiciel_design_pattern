package pizza;

public abstract class Pizza implements IProduct {
    private String aName;

    public String getName() {
        return aName;
    }

    protected void setName(String aName) {
        this.aName = aName;
    }
}
