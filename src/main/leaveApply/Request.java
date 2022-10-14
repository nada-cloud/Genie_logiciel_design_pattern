package leaveApply;

public class Request {

    public int duration;
    public String reason;
    public String name;

    Request(int duration, String reason, String name){
        this.duration = duration;
        this.reason = reason;
        this.name = name;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getReason() {
        return this.reason;
    }

    public String getName() {
        return this.name;
    }
}
