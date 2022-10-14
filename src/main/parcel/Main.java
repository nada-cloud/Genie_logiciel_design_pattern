package parcel;

public class Main {
    public static void main(String[] args) {
        Client realBuyer = new Client("toto", "0666666666", "shampoo");
        Client delegatedBuyer = new Client("tata");
        Client notDelegated = new Client("titi");
        realBuyer.delegateDelivery(delegatedBuyer);
        Service deliveryService = new Service();
        DeliveryService proxyService = new Proxy(deliveryService);
        proxyService.deliverTo(realBuyer);
        proxyService.deliverTo(delegatedBuyer);
        proxyService.deliverTo(notDelegated);
    }
}
