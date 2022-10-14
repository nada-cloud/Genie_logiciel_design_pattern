package leaveApply;

public class LeaveRequest {

    private RequestHandler requestHandler1;

    public LeaveRequest(){
        this.requestHandler1 = new Responsable();
        RequestHandler requestHandler2 = new Manager();
        RequestHandler requestHandler3 = new Ceo();
        requestHandler1.setNextHandler(requestHandler2);
        requestHandler2.setNextHandler(requestHandler3);
    }
    public static void main(String[] args) {

        LeaveRequest leaveRequest = new LeaveRequest();
        int duration = 40;
        String reason = "Sickness";
        String name = "Bob";
        leaveRequest.requestHandler1.handle(new Request(duration,reason,name));
    }
}
