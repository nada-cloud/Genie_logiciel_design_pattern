package youtube;

public class Follower implements Observer{

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String newFollowerName) {
        this.followerName = newFollowerName;
    }

    @Override
    public String getName() {
        return followerName;
    }

    public void play() {
        System.out.println("Playing video...");
    }
}
