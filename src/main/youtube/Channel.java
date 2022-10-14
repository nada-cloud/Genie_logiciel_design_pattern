package youtube;

import java.util.Arrays;

public class Channel implements Subject{

    private Observer[] observers = new Observer[0] ;
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Registering observer " + observer.getName() + " to channel " + channelName);
        Observer[] newObservers = Arrays.copyOf(observers, observers.length + 1);
        newObservers[observers.length] = observer;
        this.observers = newObservers;
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removing observer " + observer.getName() + " from channel " + channelName);
        Observer[] newObservers = Arrays.copyOf(observers, observers.length - 1);
        int i = 0, j = 0;
        while (i < observers.length-1 || j < observers.length) {
            System.out.println(observers[j].getName());
            if (!observers[j].getName().equals(observer.getName())) {
                System.out.println("not the same name... not deleting " + observers[j].getName());
                newObservers[i] = observers[j];
                i++;
            }
            j++;
        }
        this.observers = newObservers;
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers...");
    }

    @Override
    public Observer[] getObservers() {
        return observers;
    }

    @Override
    public String getName() {
        return channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
