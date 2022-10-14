package parcel;

public class Proxy implements DeliveryService {

    Service realService;

    Proxy(Service realService) {
        this.realService = realService;
    }


    public boolean checkAccess(Client client) {
        if (client.isRealBuyer()) return true;
        if (client.isDelegated()) return true;
        return false;
    }

    @Override
    public void deliverTo(Client client) {
        if (checkAccess(client)) {
            realService.deliverTo(client);
        } else {
            System.out.println("Can not deliver parcel, the person is not delegated to receive the parcel.");
        }
    }
}
