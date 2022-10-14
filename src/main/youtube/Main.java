package youtube;

public class Main {
    public static void main(String[] args) {
        Subject lyricsChannel = new Channel("Lyrics Channel", "active");
        Observer followerOne = new Follower("YoutubeUser");
        lyricsChannel.registerObserver(followerOne);
        lyricsChannel.removeObserver(followerOne);
        System.out.println("New list of channel " + lyricsChannel.getName() + " followers is composed of " + lyricsChannel.getObservers().length + " members. (should be 0)");
        Observer followerTwo = new Follower("NadaCloud");
        Observer followerThree = new Follower("KarimaCloud");
        Observer followerFour = new Follower("CloudUser");
        lyricsChannel.registerObserver(followerTwo);
        lyricsChannel.registerObserver(followerThree);
        lyricsChannel.registerObserver(followerFour);
        System.out.println("List of channel" + lyricsChannel.getName() + " followers is composed of " + lyricsChannel.getObservers().length + " members. (should be 3)");
        lyricsChannel.removeObserver(followerThree);
        Observer[] lyricsChannelObservers = lyricsChannel.getObservers();
        System.out.println("New observers :");
        for (int i=0; i<lyricsChannelObservers.length; i++) {
            System.out.println("- " + lyricsChannelObservers[i].getName());
        }
        followerFour.update("MyNewName");
        lyricsChannel.removeObserver(followerFour);
        lyricsChannelObservers = lyricsChannel.getObservers();
        System.out.println("New observers after deleting MyNewName (previous name : CloudUser) :");
        for (int i=0; i<lyricsChannelObservers.length; i++) {
            System.out.println("- " + lyricsChannelObservers[i].getName());
        }
    }
}
