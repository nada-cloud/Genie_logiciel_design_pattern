package leaveApply;

public interface RequestHandler {

    public void setNextHandler(RequestHandler handler);

    public void handle(Request req);
}
