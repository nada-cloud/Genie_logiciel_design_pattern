package leaveApply;

public class Ceo implements RequestHandler{

    private RequestHandler reqHandler;

    @Override
    public void setNextHandler(RequestHandler handler) {
        this.reqHandler = handler;
    }

    @Override
    public void handle(Request req) {
        if(req.getDuration()>15){
            System.out.println(req.getDuration()+ " days leave request by "+req.getName() +" for " + req.getReason() +" reasons has been validated by the CEO");
        }else{
            this.reqHandler.handle(req);
        }
    }
}
