package leaveApply;

public class Responsable implements RequestHandler{

    private RequestHandler reqHandler;

    @Override
    public void setNextHandler(RequestHandler handler) {
        this.reqHandler = handler;
    }

    @Override
    public void handle(Request req) {
        if(req.getDuration()<=2){
            System.out.println(req.getDuration()+ " days leave request by "+req.getName() +" for " + req.getReason() +" reasons has been validated by the responsable");
        }else{
            this.reqHandler.handle(req);
        }
    }
}
